import java.util.Scanner;

public class Project6
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text->");
        String inp = scanner.nextLine();
        String sample = "A man, a plan, a canal: Panama";
        if (isPalindrome(inp))
        {
            System.out.println("is a Palindrome");
        } else
        {
            System.out.println("is not a Palindrome");
        }
    }

    private static boolean isPalindrome(String text)
    {
        String filteredText = filterText(text);
        return filteredText.equalsIgnoreCase(reverseText(filteredText));
    }

    private static String reverseText(String text)
    {
        StringBuilder reveredText = new StringBuilder(text);
        reveredText.reverse();
        return reveredText.toString();
    }

    private static String filterText(String text)
    {
        StringBuilder filteredText = new StringBuilder();
        for (int i = 0; i < text.length(); i++)
        {
            if (Character.isLetterOrDigit(text.charAt(i)))
            {
                filteredText.append(text.charAt(i));
            }
        }
        filteredText.trimToSize();
        return filteredText.toString();
    }
}
