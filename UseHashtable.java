import mypkg.Util;
import mypkg.Account;
import java.util.*;
public class UseHashtable
{
    Hashtable<Integer,Account>b;
    Account obj;
    UseHashtable()
    {
        obj=null;
        b=new Hashtable<Integer,Account>();
    }
    void add()
    {
        int no=Util.iInput("Ac no: ");
        if(b.containsKey(no)==true)
        {
            Util.display("Record Exits");
            return;
        }
        obj=new Account();
        obj.setData(no);
        b.put(no,obj);
        Util.display("Record Added");
    }
    void mod()
    {
        int no=Util.iInput("Ac no: ");
        if(b.containsKey(no)==false)
        {
            Util.display("Record not Exits");
            return;
        }
        obj=b.get(no);
        obj.setData(no);
        Util.display("Record modify");
    }
    void del()
    {
        int no=Util.iInput("Ac no: ");
        if(b.containsKey(no)==true)
        {
            Util.display("Record Exits");
            return;
        }
        b.remove(no);
        Util.display("Record deleted");
    }
    void display()
    {
       Set<Integer>s=b.keySet();
        iterator<Integer>a=s.iterator();
        while(a.hasNext())
        {
            obj=b.get(a.next());
            obj.display();
        }
    }
    void menu()
        {
            String[]options=new String[]{"add","mod","del","display","Exit"};
            while(true)
            {
                int opt=Util.oInput("choose one","Account","options");
                if(opt==4)
                break;
                switch(opt)
                {
                    case 0:
                        add();break;
                    case 1:
                        mod();break;
                    case 2:
                        del();break;
                    case 3:
                         display();
                }
            }
        }
        public static void main(String[]args)
        {
            UseHashtable p=new UseHashtable();
            p.menu();
        } 
}