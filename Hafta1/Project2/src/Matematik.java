import java.util.Random;

public class Matematik
{
    public static void main(String[] args)
    {
        int a = (int)Math.ceil(2.3);
        double z = Math.floor(4.2);
        System.out.println(a);
        System.out.println(z);
        int b = 2;
        int c = 4;
        int max = Math.max(b,c);
        int min = Math.min(b,c);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        //
        int bigg = Integer.MAX_VALUE;
        //System.out.println( Math.addExact(bigg,1)); //int overflow

        double rand = Math.random();
        Random rnd = new Random();
        int x = rnd.nextInt(1693);
        System.out.println(x);
        //

    }
}
