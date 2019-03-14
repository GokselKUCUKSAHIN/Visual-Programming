import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int year = 2019;
        Scanner input = new Scanner(System.in);
        while(true)
        {
            System.out.print("Değer gir->");
            year = input.nextInt();
            if(year % 4 == 0 && year % 100 != 0)
            {
                System.out.println(year + " Artık yıl");
            }
            else if(year % 400 == 0)
            {
                System.out.println(year + " Artık yıl");
            }
            else
            {
                System.out.println(year + " Artık yıl değil");
            }
        }


    }
}
