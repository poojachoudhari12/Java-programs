import java.util.*;

class Thread1 extends Thread 
{ 
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Thread a: " + i);
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e) 
            {
                System.out.println(e);
            }
        }
    }
}

class Thread2 extends Thread 
{  
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Thread b: " + i);
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

public class ThreadMain 
{  
    public static void main(String[] args)
    {
        Thread1 obj1 = new Thread1();
        Thread2 obj2 = new Thread2();
        obj1.start();  
        obj2.start();  
    }
}
