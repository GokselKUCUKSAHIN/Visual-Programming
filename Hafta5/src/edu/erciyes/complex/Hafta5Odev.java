package edu.erciyes.complex;

public class Hafta5Odev
{

    public static void main(String[] args)
    {
        Complex c1 = new Complex(3,-4);
        Complex c2 = new Complex(3,5);
        Complex c3 = new Complex(2,19);
        System.out.println(c1.doubleValue());
        System.out.println(c2.doubleValue());
        System.out.println(c3.doubleValue());
        System.out.println(c3.compareTo(c2));
    }
}
