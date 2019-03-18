package edu.erciyes.complex;

import java.util.Objects;

public class Complex extends java.lang.Number implements Comparable<Complex>
{

    private double real;
    private double imaginary;
    private static int numberOfComplex = 0;

    public Complex(double real, double imaginary)//construction 1
    {
        this.real = real;
        this.imaginary = imaginary;
        numberOfComplex++;
    }

    public Complex()//construction 2
    {
        this(0.0, 0.0);
        numberOfComplex++;
    }

    public static int getNumberOfComplex()
    {
        return numberOfComplex;
    }

    public double getReal()
    {
        return this.real;
    }

    public double getImaginary()
    {
        return this.imaginary;
    }

    public void setReal(double real)
    {
        this.real = real;
    }

    public void setImaginary(double imaginary)
    {
        this.imaginary = imaginary;
    }

    //Method
    public Complex plus(Complex comp)
    {
        return new Complex(this.real + comp.real, this.imaginary + comp.imaginary);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return Double.compare(complex.real, real) == 0 &&
                Double.compare(complex.imaginary, imaginary) == 0;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(real, imaginary);
    }

    @Override
    public String toString()
    {
        return this.real + " + " + this.imaginary + "i";
    }

    @Override
    public int intValue()
    {
        return (int)Math.sqrt(Math.pow(this.real,2) + Math.pow(this.imaginary,2));
    }

    @Override
    public long longValue()
    {
        return (long)Math.sqrt(Math.pow(this.real,2) + Math.pow(this.imaginary,2));
    }

    @Override
    public float floatValue()
    {
        return (float)Math.sqrt(Math.pow(this.real,2) + Math.pow(this.imaginary,2));
    }

    @Override
    public double doubleValue()
    {
        return Math.sqrt(Math.pow(this.real,2) + Math.pow(this.imaginary,2));
    }

    @Override
    public int compareTo(Complex o)
    {
        if(this.doubleValue() == o.doubleValue())
        {
            return 0;
        }
        else
        {
            if(this.doubleValue()-o.doubleValue() > 0)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
    }
}