package edu.erciyes.employee;

import java.time.LocalDate;
import java.util.Collection;

public abstract class Employee implements Comparable<Employee>
{

    private String name;
    private LocalDate hireDate;


    public Employee(String name, LocalDate hireDate)
    {
        Tools.disallowNullArgs(name, hireDate);
        this.name = name;
        this.hireDate = hireDate;
    }

    public abstract double monthlyPay();

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

    @Override
    public int compareTo(Employee o)
    {
        return this.hireDate.compareTo(o.hireDate);
    }
}
