public class App5
{
    public static void main(String[]args)
    {
        int i=1;
        int no=(int)(Math.random()*100);
        System.out.println("Table");
        while(i<=10)
        {
            System.out.println(" "+(no*i));
            i++;
        }
    }
}