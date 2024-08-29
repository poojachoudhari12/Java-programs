class myClass implements Runnable
{
    int no;
    String nm;
    myClass(int a,String b)
    {
        no=a;
        nm=b;
    }
    public void run()
    {
        System.out.println("Thread"+nm+" ");
        for(int i=1;i<=no;i++)
        {
            System.out.println(nm+" "+i);
            try{
                Thread.sleep(100);
            }
            catch(Exception e)
            {}
        }
    }
}
public class Thread4
{
    public static void main(String[]args)
    {
        Thread a=new Thread(new myClass(10,"A"));
        Thread b=new Thread(new myClass(6,"B"));
        a.start();
        b.start();
        try{
            a.join();
            b.join();
        }
        catch(Exception e){}
        System.out.println("Main thread finished");
    }
}