
import mypkg.Util;
import mypkg.Account;
import java.io.*;
import java.util.HashSet;

class ObjWriteA
{
    public static void main(String[]args)throws Exception
    {
     FileOutputStream fos=new FileOutputStream("Acc.dat");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    HashSet<Integer>a=new HashSet();
    Account obj=null;
    while(true)
    {
        int no=Util.iInput("Account no: ");
        if(no==0)
        break;
        if(a.add(no)==false)
        {
            Util.display("record exists");
            continue;
        }
        obj=new Account();
        obj.setData(no);
        oos.writeObject(obj);
    
    }
    oos.close();
    fos.close();
}
}