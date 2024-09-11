class Shared
{
    void table(int n)
    {
        System.out.println("Table");
        for(int i=1;i<=10;i++)
             System.out.println(" "+(n*i));
    }
}
class Sync extends Thread
{
    Shared obj;
    int n;
    Sync(Shared obj,int no)
    {
        super();
        this.obj=obj;
        n=no;
        start();
    }
    public void run()
    {
        obj.table(n);
    }
}
public class Thrd6
{
    public static void main(String [] args)
    {
        Shared s=new Shared();
        Sync a=new Sync(s, 5);
        Sync b=new Sync(s, 9);
        try
        {
            a.join();
            b.join();
        }
        catch(Exception e){}
    }
}
//Synchronization of threads
/*when two or more threads need access to shared resourse,they need some way to ensure that the resourse will be used by only one thread at a time.The process by which this is achieved is called synchronization.
 * key to synchronization is the concept of the monitor a monitor is an object that is used as a mutually exclusive lock.Only one thread can own a monitor at a given time when a thread aquires a lock, it is said to have entered the monitor.All other threads attempting to enter the locked monitor will be suspended until the first thread exits the monitor. These other threads are said to be waiting for the monitor.A thread that owns a monitor can reenter the same monitor if it so desire we can synchronize our code in either of two ways both involves the use of the synchronized keyword
 * a)Using synchronized method
 * b)Using synchronized statement
 * a)Using synchronized method= Synchronization is easy in java, because all object have their own implicit monitor associated with them to enter the objects monitor just call a method that has been modified with synchronized keyword.While a thread is inside a synchronized method ,all other threads that try to call on the same instance have to wait.To exit the monitor and relinquish control of the object to the next waiting thread,the wner of the monitor simply returns from the synchronized method. 
 * b)The synchronized statement= While creating synchronized methods within classes that you create is an easy and effective means of achieving synchronization, it will not work in all cases to understand why consider the following imagine that you want to synchronized accessed to object of s class that was not designed for multithreaded access that is the class does not use synchronized methods.Further this class was not created by you,but by a third party and you do not have access to the source code.Thus you cant add synchronized to the appropriate moethods within the class .How can access to an object of this class being synchronized?Fortunately the solution  this problem is quiet easy,simply put calls to the methods define by this class inside a synchronized block following is tha general form of synchronized statement
 * synchronized(object
 * { 
 *   ------;
 * }   
 * here object is the reference to the object being synchronized a synchronized block ensure that a call to a method that is member of object occurs only after the current thread has successfully enter objects monitor. 
   
 */