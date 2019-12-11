package Laborator5;

public class B extends A
{
    protected String b;

    public B(String value, X x)
    {
        super(value, x);
        b = "B: " + value;
    }

    public void displayState()
    {
        System.out.println("Current state: " + b);
        System.out.println("Current state: " + x.getX());
        super.displayState();
    }
}
