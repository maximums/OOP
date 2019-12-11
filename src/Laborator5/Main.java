package Laborator5;

public class Main
{
    static public void main(String[] args)
    {
        A a = new A("hopa", new X("x from a"));
        J j = new J("value", new X("name"));
        B b = new B("opa", new X("xXx"));

        b.displayState();
    }
}
