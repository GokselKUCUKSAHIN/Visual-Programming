package edu.erciyes.employee;

public class Tools
{

    private Tools()
    {
        //
    }

    static void disallowNullArgs(Object first, Object... args) throws IllegalArgumentException
    {
        boolean flag = true;
        if (first != null)
        {
            for (Object arg : args)
            {
                if (arg == null)
                {
                    flag = false;
                    break;
                }
            }
        } else
        {
            flag = false;
        }
        if (flag == false)
        {
            throw new IllegalArgumentException("'Null Arg!' Gecersiz girdi!!!");
        }
    }

    static void diasallowZerosAndNegatives(double... args) throws IllegalArgumentException
    {
        for (double arg : args)
        {
            if (arg <= 0.0)
            {
                throw new IllegalArgumentException("Gecersiz deger!");
            }
        }
    }
}
