package edu.erciyes.employee;

public interface Payable
{

    public static final int MONTHS_PER_YEAR = 12; //public static final yazmasak bile p s final olacak şekilde yapar.

    public abstract double pay(); //public abstract yazmasak bile kendisi public abstract yapar
}
