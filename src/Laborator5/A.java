package Laborator5;

public class A
{
    protected String a;
    protected X x = new X("xxx");

    public A(String value, X x)
    {
        a = "A: " + value;
        this.x = x;
    }

    public void displayState()
    {
        System.out.println("Current state: " + a);
        System.out.println("Current state: " + x.getX());
    }
}
