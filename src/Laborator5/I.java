package Laborator5;

public class I extends H
{
    protected String i;

    public I(String val, X x)
    {
        super(val, x);
        i = "I: " + val;
    }

    public void displayState()
    {
        System.out.println("Current state: " + i);
        System.out.println("Current state: " + x.getX());
        super.displayState();
    }
}
