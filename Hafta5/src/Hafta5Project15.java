import java.io.File;
import java.util.Date;

public class Hafta5Project15
{

    public static void main(String[] args)
    {
        String fileName = "demo.py";
        File file = new File(fileName);
        System.out.println("Is exist: " + file.exists());
        System.out.println("Is readable: " + file.canRead());
        System.out.println("Is writable: " + file.canWrite());
        System.out.println("Size: " + file.length());
        System.out.println("Is file: " + file.isFile());
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("Last edit date: " + new Date(file.lastModified()));
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        //file.delete();




    }
}
