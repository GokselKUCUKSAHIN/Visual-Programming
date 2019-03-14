import java.util.Scanner;

public class Hafta2Odev1Project8
{

    //is Palindrome ?
    public static void main(String[] args)
    {
        String sample = "A man, a plan, a canal: Panama"; //this must be a Palindrome.
        Scanner scanner = new Scanner(System.in);
        String input;
        do
        {
            System.out.print("Enter a Text->");
            input = scanner.nextLine();
            if (isPalindrome(input))
            {
                System.out.println(input + " is a Palindrome");
            } else
            {
                System.out.println(input + " is a NOT Palindrome");
            }
        }
        while (!input.equalsIgnoreCase("exit"));
    }

    private static boolean isPalindrome(String text)
    {
        String cleared = text.replaceAll("[^a-zA-Z0-9]", "");//filter text with regexs :)
        //System.out.println(cleared); //debug print
        String lower = cleared.toLowerCase();
        boolean flag = true;

        for (int i = 0; i < lower.length() / 2; i++)
        {
            if (lower.charAt(i) != lower.charAt(lower.length() - 1 - i))
            {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
