package edu.erciyes.employee;

import java.time.LocalDate;

public class HourlyEmployee extends Employee
{

    private double hourlyWage;
    private double monthlyHours;

    public HourlyEmployee(String name, LocalDate hireDate, double hourlyWage, double monthlyHours)
    {
        super(name, hireDate);
        this.setHourlyWage(hourlyWage);
        this.setMonthlyHours(monthlyHours);
    }

    public HourlyEmployee(String name, LocalDate hireDate)
    {
        this(name, hireDate, 20, 160);

    }

    public double getHourlyWage()
    {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage)
    {
        Tools.diasallowZerosAndNegatives(hourlyWage);
        this.hourlyWage = hourlyWage;
    }

    public double getMonthlyHours()
    {
        return monthlyHours;
    }

    public void setMonthlyHours(double monthlyHours)
    {
        this.monthlyHours = monthlyHours;
    }

    @Override
    public double monthlyPay()
    {
        return this.hourlyWage * this.monthlyHours;
    }

    @Override
    public String toString()
    {
        return super.toString() + " HourlyWage: " + getHourlyWage() + " MonthlyHour: " + getMonthlyHours();
    }
}