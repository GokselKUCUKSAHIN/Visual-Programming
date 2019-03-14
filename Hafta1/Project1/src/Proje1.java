import java.math.BigDecimal;

public class Proje1 {
    public static void main(String[] args)
    {
        //byte b = 127;
        System.out.println(Byte.SIZE);
        System.out.println(Byte.MAX_VALUE);
        double massOfEarth = 5.97E24;
        System.out.println(massOfEarth);
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);
        double d = 4.35;
        double o = d * 100;
        System.out.println(o);
        BigDecimal bd1 = new BigDecimal("0.03");
        BigDecimal bd2 = new BigDecimal("0.02");
        System.out.println(bd1.subtract(bd2));
        var x = 2.4 + 564;
        System.out.println(x);
        int sayi = (int)2.4;
        System.out.println(sayi);
        //merhaba dünya
        short n1 = 0b0000_1111_1000_1010;
        System.out.println(n1);
        byte n2 = (byte)n1;
        System.out.println(n2);
        //yüksek seviye wow such tech much work
        String mada = "Hello, World.";
        System.out.println(mada);
        mada += 3.14159265;
        System.out.println(mada);
        int c1 = 3;
        c1 += 1;
    }
}