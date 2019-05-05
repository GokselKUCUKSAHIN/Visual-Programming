package edu.erciyes.generic;

import java.util.ArrayList;

public class WildCardNeed
{

    public static void main(String[] args)
    {
        GenericStack<Number> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(-2);
        //
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        intStack.pushAll(ints);

        //
        ArrayList<Number> dest = new ArrayList<>();
        intStack.popAll(dest);
        System.out.println(dest.toString());

    }

    public static double max(GenericStack<? extends Number> stack)
    {
        double max = stack.pop().doubleValue();
        while (!stack.isEmpty())
        {
            double value = stack.pop().doubleValue();
            if (value > max)
            {
                max = value;
            }
        }
        return max;
    }
}
