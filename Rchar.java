//prog to read text file
import java.io.*;
class Rchar
{
    public static void main(String[]args)throws Exception{
        File f=new File ("abc.txt");
        if(f.exists()==false)
        {
            System.out.println("file does not exist");
            return;
        }
        FileReader fr=new FileReader(f);
        int val=0;
        while(true)
        {
            val=fr.read();
            if(val==-1)
            break;
            System.out.println((char)val);
        }
        fr.close();
    }
}