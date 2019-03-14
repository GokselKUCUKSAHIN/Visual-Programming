public class Project4 {
    public static void main(String[] args) {
           /* String s1 = "jelly";
        String s2 = "jelly";*/
        String s1 = new String("jelly");
        String s2 = new String("jelly");
        if(s1 == s2)
        {
            System.out.println("Ok");
        }
        else
        {
            System.out.println("Non");
        }
        //
        if(s1.equals(s2))
        {
            System.out.println("OK equal");
        }
        else
        {
            System.out.println("Not EQUAL");
        }
        //
    }
}
