package Laborator5;

public class G extends F
{
    public String g;

    public G(String val, X x)
    {
        super(val, x);
        g = "G: " + val;
    }

    public void displayState()
    {
        System.out.println("Current state: " + g);
        System.out.println("Current state: " + x.getX());
        super.displayState();
    }
}
