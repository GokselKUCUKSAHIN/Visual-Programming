import java.util.Scanner;
/* türkçe karakter */
public class Hafta1Odev
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi ->");
        /* string test mada faka */
        int deger = input.nextInt();
        int i =2;
        int all = deger;
        while(deger > 0)
        {
            if(asalMi(i))
            {
                System.out.println((all - deger+1) +") " + i);
                deger--;
            }
            i++;
        }
    }
    private static boolean asalMi(int Sayi)
    {
        boolean Asal = true;
        for(int i = 2; i <= Math.sqrt(Sayi); i++)
        {
            if(Sayi % i == 0)
            {
                Asal = false;
                break;
            }
        }
        return (Sayi>=2) ? Asal : false;
    }
}
