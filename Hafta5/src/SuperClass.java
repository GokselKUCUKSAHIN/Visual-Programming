class SuperClass
{
//C# but less Cool
    public static void staticMethod()
    {
        System.out.println("Static Method of superclass");
    }

    public void instanceMethod()
    {
        System.out.println("Instance Method of superclass");
    }
}

class SubClass extends SuperClass
{

    public static void staticMethod()
    {
        System.out.println("Static Method of subclass");
    }

    @Override
    public void instanceMethod()
    {
        System.out.println("Instance Method of subclass");
    }
}

class TestClass
{

    public static void main(String[] args)
    {
        SuperClass sup = new SubClass();
        sup.instanceMethod();
        sup.staticMethod();
        if (sup instanceof SubClass)
        {
            System.out.println(true);
        }
    }
}