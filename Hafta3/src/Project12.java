public class Project12
{

    //OOP = APIE
    //ABSTRACTION
    //POLYMORPHISM
    //INHERITANCE
    //ENCAPSULATION
    public static void main(String[] args)
    {
        System.out.println(sum());
        System.out.println(sum(2, 3, 4, 5, 4, 32, 3, 76));
        System.out.println(min(2, 412, 5, 54, -1, 2, 2, 3, 4, 5, 6));


        System.out.println(Complex.getNumberOfComplex());
        Complex c = new Complex(1.0, 2.5);
        Complex a = new Complex(1.0, 2.5);
        Complex b = a.plus(c);
        System.out.println(b.toString());
        System.out.println(Complex.getNumberOfComplex());

        BlockTest blc = new BlockTest();
        BlockTest bl2 = new BlockTest();

        System.out.println(a.equals(c));
        System.out.println(a == c);


    }
    public static void fun(boolean bool, boolean ...args)
    {

    }
    public static void fun(int first,int ... args)
    {

    }

    public static int sum(int... nums)
    {
        int sum = 0;
        for (int num : nums)
        {
            sum += num;
        }
        return sum;
    }

    public static int min(int first, int... nums)
    {
        int currentMin = first;
        for (int num : nums)
        {
            if (num < currentMin)
            {
                currentMin = num;
            }
        }
        return currentMin;
    }


}
