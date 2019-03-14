import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Hafta2Odev4Project11
{

    //selection Sort
    public static void main(String[] args)
    {
        int[] dizi = new int[50];
        int[] dizi2 = new int[50];
        int[] dizi3 = new int[50];
        Random rand = new Random();
        for (int i = 0; i < dizi.length; i++)
        {
            dizi[i] = randomBounds(rand, 0, 250);
        }
        //
        System.arraycopy(dizi, 0, dizi2, 0, dizi.length);
        System.arraycopy(dizi, 0, dizi3, 0, dizi.length);
        //
        System.out.println("Unsorted Array:");
        System.out.println(Arrays.toString(dizi));
        System.out.println("\nAfter Sorting (Selection Sort)");
        selectionSort(dizi2);//my sort
        System.out.println(Arrays.toString(dizi2));
        System.out.println("\nJava's own sort Method");
        Arrays.sort(dizi3);//javas sort
        System.out.println(Arrays.toString(dizi3));
    }

    private static void selectionSort(int[] dizi)
    {
        int len = dizi.length;
        int minIndex,min,temp,j;
        //apie
        //abstraction,polymorphism,inheritance,encapsulation
        for (int i = 0; i < len; i++)
        {
            min = dizi[i];
            minIndex = i;
            for (j = i + 1; j < len; j++)
            {
                if (dizi[j] < min)
                {
                    minIndex = j;
                    min = dizi[j];
                }
            }
            //swap
            if (i != minIndex)
            {
                //eğer swap yapılacak elemanlar aynı değilse
                temp = dizi[i];
                dizi[i] = dizi[minIndex];
                dizi[minIndex] = temp;
            }
            //System.out.println(min); //debug
        }
    }

    private static int randomBounds(Random rnd, int min, int max)
    {
        return rnd.nextInt(max - min) + min;
    }
}
