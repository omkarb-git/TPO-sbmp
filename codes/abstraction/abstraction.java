abstract class boss
{
    abstract void Task();
    void sal()

    {
        System.out.println("sal deposited");
    }
}
class Emp Extends boss
{
    void Task()
    {
        System.out.println("task completed");
    }
}

public class abstraction 
{
    public static void main(String[] args)
    {
        emp e1 = new emp();
        e1.sal();
    }
}