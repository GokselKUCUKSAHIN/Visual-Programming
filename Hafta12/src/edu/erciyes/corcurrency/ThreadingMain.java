package edu.erciyes.corcurrency;

import javafx.concurrent.Task;

public class ThreadingMain
{

    public static void main(String[] args)
    {
        //100 hello
        //100 good bye
        Thread helloThread = new Hello();
        Runnable goodByeTask = new Goodbye();
        Thread goodByeThread = new Thread(goodByeTask);
        //helloThread.start();
        //goodByeThread.start();
        Thread x = new Thread(()->{
            for (int i = 0; i < 1000000; i++)
            {
                System.out.println(i + " " +isPrime(i) + " x");
            }
        });
        Thread y = new Thread(()->{
            for (int i = 0; i < 1000000; i++)
            {
                System.out.println(i + " " +isPrime(i) + " y");
            }
        });
        Thread z = new Thread(()->{
            for (int i = 0; i < 1000000; i++)
            {
                System.out.println(i + " " +isPrime(i) + " z");
            }
        });
        Thread t = new Thread(()->{
            for (int i = 0; i < 1000000; i++)
            {
                System.out.println(i + " " +isPrime(i) + " t");
            }
        });
        x.start();
        y.start();
        z.start();
        t.start();



    }
    public static boolean isPrime(int number)
    {
        boolean prime = true;
        for (int i = 2; i <= Math.sqrt(number); i++)
        {
            if(number%i == 0)
            {
                prime = false;
                break;
            }
        }
        return (prime && number >= 2);
    }
}
