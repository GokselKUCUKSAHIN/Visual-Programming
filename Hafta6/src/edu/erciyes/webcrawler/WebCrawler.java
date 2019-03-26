package edu.erciyes.webcrawler;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler
{

    public static void main(String[] args)
    {
        String startingURL = "https://www.erciyes.edu.tr/";
        crawl(startingURL);
    }
    private static void crawl(String startingURL)
    {
        ArrayList<String> pendingURLs = new ArrayList<>();
        ArrayList<String> traversedURLs = new ArrayList<>();
        //
        pendingURLs.add(startingURL);
        while(!pendingURLs.isEmpty() && traversedURLs.size() < 100)
        {
            String urlString = pendingURLs.remove(0);
            traversedURLs.add(urlString);
            System.out.println("Crawl " + urlString);
            for ( String s:getSubURLs(urlString))
            {
                if(!traversedURLs.contains(s) && !pendingURLs.contains(s))
                {
                    pendingURLs.add(s);
                }
            }
        }
    }
    private static ArrayList<String> getSubURLs(String urlString)
    {
        ArrayList<String> list = new ArrayList<>();
        String regex = "((http|https)://(\\w+\\.)+(edu|com|net|org|gov)(\\.tr)?)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        try
        {
            URL url = new URL(urlString);
            Scanner scanner = new Scanner(url.openStream());
            while (scanner.hasNext())
            {
                String line = scanner.nextLine();
                matcher = pattern.matcher(line);
                while(matcher.find())
                {
                    list.add(matcher.group());
                }
            }
        }
        catch (MalformedURLException ex)
        {
            //e.printStackTrace();
        }
        catch (IOException ex)
        {
            //e.printStackTrace();
        }

        return list;
    }
}
