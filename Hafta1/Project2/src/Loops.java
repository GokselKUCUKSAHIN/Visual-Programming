import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <=20; i++) {
            if (i %2 == 0)
            {
                System.out.println(i); //ez boi
            }
        }
        while(true)
        {
            System.out.print("Birinci değer->");
            int v1 = input.nextInt();
            System.out.print("İkinci değer->");
            int v2 = input.nextInt();
            int min = Math.min(v1,v2);
            int ebob = 1;

            //türkçe karakter

            for (int i = 1; i < min; i++) {
                if(v1%i == 0 && v2%i==0)
                {
                    if(i > ebob)
                    {
                        ebob = i;
                    }
                }
            }
            System.out.println(ebob);
        }
    }
}
