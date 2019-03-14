package edu.erciyes.employee;

import java.time.LocalDate;
import java.util.ArrayList;

public class Company
{
    ArrayList<Employee> employees = new ArrayList<Employee>();
    public Company()
    {
        employees.add(new SalariedEmployee("John Doe", LocalDate.of(2010,10,10),50000));
        employees.add(new SalariedEmployee("Bill Gates",LocalDate.of(2011,9,2),100000));
        employees.add(new SalariedEmployee("Göksel Küçükşahin",LocalDate.of(2005,2,16),30000));
        //
        employees.add(new HourlyEmployee("Ada Lovelace",LocalDate.of(1980,9,2),150,35));
        employees.add(new HourlyEmployee("Ada Lovelace",LocalDate.of(1990,10,22),120,30));
        employees.add(new HourlyEmployee("Genji Shimada",LocalDate.of(1989,1,5),550,500));
    }
    public  double monthlyPayroll()
    {
        double payroll = 0.0;
        for (Employee employee:employees)
        {
            payroll += employee.monthlyPay();
        }
        return  payroll;
    }
    @Override
    public String toString()
    {
        String compStr = "";
        for (Employee employee:employees)
        {
            compStr += employee.toString() + "\n";
        }
        return  compStr;
    }

}
