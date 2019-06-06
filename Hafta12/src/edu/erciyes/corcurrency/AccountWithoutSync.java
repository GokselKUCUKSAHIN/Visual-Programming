package edu.erciyes.corcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccountWithoutSync
{

    private static Account account = new Account();

    public static void main(String[] args)
    {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++)
        {
            executor.execute(new AddADollarTast());
        }
        executor.shutdown();
        while (executor.isTerminated())
        {

        }
        System.out.println(account.getBalance());
    }

    static class AddADollarTast implements Runnable
    {

        @Override
        public void run()
        {
            account.deposit(1);
        }
    }
}

class Account
{
    private Lock lock = new ReentrantLock();
    private int balance = 0;

    public int getBalance()
    {
        return balance;
    }

    public void deposit(int amount)
    {
        lock.lock();

        try
        {
            int newBalance = this.balance + 1;
            Thread.sleep(1);
            balance = newBalance;
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        finally
        {
            lock.unlock();
        }
    }
}
