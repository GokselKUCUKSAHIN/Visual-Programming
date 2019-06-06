package edu.erciyes.corcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadCooperation
{

    private static AccountCoop account = new AccountCoop();

    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new DepositTast());
        executorService.execute(new WithdrawTask());
        executorService.shutdown();
    }

    static class DepositTast implements Runnable
    {

        @Override
        public void run()
        {
            try
            {
                while (true)
                {
                    account.deposit((int) (Math.random() * 5) + 1);
                    Thread.sleep(1000);
                }
            }
            catch (InterruptedException e)
            {

            }
        }
    }

    static class WithdrawTask implements Runnable
    {

        @Override
        public void run()
        {
            try
            {
                while (true)
                {
                    account.withdraw((int) (Math.random() * 10 + 1));
                    Thread.sleep(1000);
                }
            }
            catch (InterruptedException e)
            {

            }

        }
    }
}

class AccountCoop
{

    private Lock lock = new ReentrantLock();
    private Condition newDopsit = lock.newCondition();
    private int balance = 0;

    public int getBalance()
    {
        return balance;
    }

    public void withdraw(int amount)
    {
        lock.lock();
        try
        {
            while (balance < amount)
            {
                newDopsit.await();
            }
            balance -= amount;
            System.out.println("\n Withdraw " + amount + " " + balance);
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

    public void deposit(int amount)
    {
        lock.lock();
        balance += amount;
        System.out.println("\nDeposit " + amount + " " + balance);
        newDopsit.signalAll();
        lock.unlock();
    }

}