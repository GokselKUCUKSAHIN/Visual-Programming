import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Project5RegexTest {
    public static void main(String[] args) {
        //---------------------------------------------//
        String history = "in 1991 Oak realeased, " +
                "\tin 1996 it was renamed as Java, " +
                "JDK 1.0 relased in 1996";
        System.out.println(history);
        System.out.println(history.replaceAll("^in","at"));
        System.out.println(history.replaceAll("in","at"));
        System.out.println(history.replaceAll("1996$","YYYY"));
        System.out.println(history.replaceAll("[01]","Y"));
        System.out.println(history.replaceAll("[^0-9]","Y"));
        System.out.println(history.replaceAll("\\D","Y"));
        System.out.println(history.replaceAll("\\d","Y"));

        //-----------------------------------------------//

        String text = "A sailor went to sea sea sea to see what he could see see seee";
        System.out.println(text.replaceAll("s..","YYY"));
        System.out.println(text.replaceAll("se{2}","YYY"));
        System.out.println(text.replaceAll("se{2,3}","YYY"));
        System.out.println(text.replaceAll("se+","YYY"));
        System.out.println(text.replaceAll("se[ea]","YYY"));

        //-----------------------------------------------//

        StringBuilder html = new StringBuilder("<h1>My heading</h1>");
        html.append("<h2>Sub-heading</h2>");
        html.append("<p>This is a Paragraph</p>");
        html.append("<h2>Summary</h2>");
        html.append("<p>Here is the Summary</p>");


        String h2pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2pattern);
        Matcher matcher = pattern.matcher(html);
        System.out.println(matcher.matches());

        int count = 0;
        matcher.reset();
        while (matcher.find())
        {
            count++;
            System.out.println(count + " " + matcher.start() + " " + matcher.end());
        }

        //String h2GroupPattern = "(<h2>.*?</h2>)"; //greedy quantifier
        String h2GroupPattern = "(<h2>)(.*?)(</h2>)"; //3 group
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(html);
        while (groupMatcher.find())
        {
            System.out.println(groupMatcher.group(2));
        }

        //


    }
}
