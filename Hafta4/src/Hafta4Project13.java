import edu.erciyes.employee.Company;
import edu.erciyes.employee.HourlyEmployee;
import edu.erciyes.employee.SalariedEmployee;

import java.time.LocalDate;

public class Hafta4Project13
{

    public static void main(String[] args)
    {
        HourlyEmployee ali = new HourlyEmployee("Ali Cengiz", LocalDate.of(2010,5,18));
        System.out.println(ali.toString());
        //new Employee(null,null);
        SalariedEmployee jelly = new SalariedEmployee("Göksel",LocalDate.of(1998,8,8),100);
        System.out.println(jelly.toString());

        ///

        SalariedEmployee veli = new SalariedEmployee("Veli",LocalDate.of(2000,1,1),40000);
        System.out.println(veli.toString());
        System.out.println("///////");
        Company comp = new Company();
        System.out.println(comp.toString());
    }
}
