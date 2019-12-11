package Laborator5;

public class D extends C
{
    protected String d;

    public D(String val, X x)
    {
        super(val, x);
        d = "D: " + val;
    }

    public void displayState()
    {
        System.out.println("Current state: " + d);
        System.out.println("Current state: " + x.getX());
        super.displayState();
    }
}
