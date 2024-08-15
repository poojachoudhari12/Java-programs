
//read  file using byte stream class
import java.io.*;

class Rbyte
{
    public static void main(String[]args)throws Exception
    {
        FileInputStream fis=new FileInputStream("abc.dat");
        int val=0;
        while(true)
        {
            val=fis.read();
            if(val==-1)
            break;
            System.out.println((char)val);
        }
        fis.close();
    }
}