import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hafta2Odev2Project9
{

    //Binary Search
    public static void main(String[] args)
    {
        int[] dizi = new int[200];
        Random rand = new Random();
        for (int i = 0; i < 200; i++)
        {
            dizi[i] = rand.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(dizi));
        Arrays.sort(dizi);
        //System.out.println(Arrays.toString(dizi));
        Scanner scan = new Scanner(System.in);
        System.out.println(dizi.length);
        while (true)
        {
            System.out.println(Arrays.toString(dizi));
            System.out.print("\nSayı gir->");
            String input = scan.nextLine();
            try
            {
                int index = Integer.parseInt(input);
                System.out.println(BinarySearch(index, dizi));
            }
            catch (Exception e)
            {
                System.out.println(e.toString() + " <- GEÇERSİZ GİRDİ!");
            }
        }
    }

    private static int BinarySearch(int find, int[] aDizi)
    {
        int len = aDizi.length;
        if (len > 0)
        {
            //eğer dizide eleman var ise (dizi boş değilse)
            int min = 0; //başlangıçta min dizinin ilk elemanı olan 0.
            int max = len - 1; //başlangıçta max dizinin son elemanı olan (Length-1).
            int mid = mid = (min + max) / 2; //mid: max ile min'in tam arası
            //System.out.printf("min = %d, max = %d, mid = %d\n",min,max,mid); //debug print
            while (max >= mid && min <= mid) //mid, min ile max arasında olduğu sürece
            {
                if (aDizi[mid] == find)
                {
                    //bulundu ise
                    return mid;
                } else
                {
                    //bulunamadı ise
                    if (aDizi[mid] < find)
                    {
                        //aranan eleman orta noktanın sağında ise
                        min = mid + 1;
                    } else
                    {
                        //aranan eleman orta noktanın solunda ise
                        max = mid - 1;
                    }
                    mid = (min + max) / 2; //yeni min ve max ile orta noktayı tekrardan hesapla
                }
                //System.out.printf("min = %d, max = %d, mid = %d\n",min,max,mid); //debug print
            }
            //
            return -1; //not found
        } else
        {
            //dizi boş ya da negatif boyutlu
            return -1; //not found
        }
    }
}
