package edu.erciyes.employee;

import java.io.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Company
{

    public ArrayList<Employee> employees = new ArrayList<Employee>();

    public Company()
    {

        employees.add(new SalariedEmployee("John Doe", LocalDate.of(2010, 10, 10), 50000));
        employees.add(new SalariedEmployee("Bill Gates", LocalDate.of(2011, 9, 2), 100000));
        employees.add(new SalariedEmployee("Göksel Küçükşahin", LocalDate.of(2005, 2, 16), 30000));
        //
        employees.add(new HourlyEmployee("Ada Lovelace", LocalDate.of(1980, 9, 2), 150, 35));
        employees.add(new HourlyEmployee("Ada Lovelace", LocalDate.of(1990, 10, 22), 120, 30));
        employees.add(new HourlyEmployee("Genji Shimada", LocalDate.of(1989, 1, 5), 550, 500));

    }

    public Company(String fileName)
    {
        employees = initFromFile(fileName);
    }

    public ArrayList<Employee> initFromFile(String fileName)
    {
        ArrayList<Employee> emps = new ArrayList<>();
        File file = new File(fileName);
        try
        {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while (line != null)
            {
                String[] fields = line.split(",");
                if (fields[0].trim().equalsIgnoreCase("SalariedEmployee"))
                {
                    //SalariedEmployee
                    emps.add(createSalariedEmployee(fields));
                }
                else if (fields[1].trim().equalsIgnoreCase("HourlyEmployee"))
                {
                    emps.add(createHourlyEmployee(fields));
                }
                line = reader.readLine();
            }
        }
        catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        return emps;
    }

    public static SalariedEmployee createSalariedEmployee(String[] fields) throws ParseException
    {
        String name = fields[1].trim();
        LocalDate date = LocalDate.parse(fields[2].trim());
        double salary = Double.parseDouble(fields[3].trim());
        return new SalariedEmployee(name, date, salary);
    }

    public static HourlyEmployee createHourlyEmployee(String[] fields) throws ParseException
    {
        String name = fields[1].trim();
        LocalDate date = LocalDate.parse(fields[2].trim());
        double wage = Double.parseDouble(fields[3].trim());
        double hour = Double.parseDouble(fields[4].trim());
        return new HourlyEmployee(name, date, wage, hour);
    }

    public double monthlyPayroll()
    {
        double payroll = 0.0;
        for (Employee employee : employees)
        {
            payroll += employee.monthlyPay();
        }
        return payroll;
    }

    @Override
    public String toString()
    {
        String compStr = "";
        for (Employee employee : employees)
        {
            compStr += employee.toString() + "\n";
        }
        return compStr;
    }

}
