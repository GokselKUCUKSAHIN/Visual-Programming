package edu.erciyes.employee;

import java.time.LocalDate;
import java.util.Collection;

public class Employee
{

    private String name;
    private LocalDate hireDate;


    private static void disallowNullArgs(Object first ,Object...args)
    {
        boolean flag = true;
        if(first != null)
        {
            for (Object arg:args)
            {
                if(arg == null)
                {
                    flag = false;
                    break;
                }
            }
        }
        else
        {
            flag = false;
        }
        if(flag == false)
        {
            throw new IllegalArgumentException("'Null Arg!' Gecersiz girdi!!!");
        }
    }
    protected static void diasallowZerosAndNegatives(double ... args)
    {
        for (double arg: args)
        {
            if(arg <= 0.0)
            {
                throw new IllegalArgumentException("Gecersiz deger!");
            }
        }
    }
    public Employee(String name, LocalDate hireDate)
    {
        disallowNullArgs(name,hireDate);
        this.name = name;
        this.hireDate = hireDate;
    }

    public double monthlyPay()
    {
        return 0;
    }

    public String getName()
    {
        return this.name;
    }

    public LocalDate getHireDate()
    {
        return hireDate;
    }

    @Override
    public String toString()
    {
        return "Name: " + this.name + " Date: " + this.hireDate;
    }
}
