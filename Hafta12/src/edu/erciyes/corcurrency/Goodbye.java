package edu.erciyes.corcurrency;

public class Goodbye implements Runnable
{

    @Override
    public void run()
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.println("Good Bye " + i);
        }
    }
}
