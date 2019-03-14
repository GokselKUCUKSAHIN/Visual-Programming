import java.util.HashMap;

public class BlockTest
{
    static double rootOf2;
    static double rootOf3;
    private final static HashMap<String,String> map = new HashMap<String, String>();
    static
    {
        System.out.println("Inside Static Block");
        rootOf2 = Math.sqrt(2);
        rootOf3 = Math.sqrt(3);
        map.put("mon","Monday");
        map.put("tue","Tuesday");
    }
    {
        System.out.println("Inside Instance Block");
    }
    public  BlockTest()
    {
        System.out.println("Inside Constructor");
    }
}
