package edu.erciyes.employee;


import java.time.LocalDate;

public class SalariedEmployee extends Employee
{
    private double annualSalary;
    private static final int MONTH_PER_YEAR = 12;
    public SalariedEmployee(String name, LocalDate hireDate,double annualSalary)
    {
        super(name,hireDate);
        diasallowZerosAndNegatives(annualSalary);
        this.annualSalary = annualSalary;
    }
    public double getAnnualSalary()
    {
        return this.annualSalary;
    }
    @Override
    public double monthlyPay()
    {
        return getAnnualSalary() / (double) MONTH_PER_YEAR;
    }
    @Override
    public String toString()
    {
        return super.toString() + " Salary: " + getAnnualSalary();
    }
}
