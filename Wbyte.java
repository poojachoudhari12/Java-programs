//file manupulation using bit string class

import java.io.*;
class Wbyte
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("abc.dat");
        while(true)
        {
            System.out.print("\ncharacter: ");
            char ch=(char)System.in.read();
            System.in.skip(5);
            if(ch=='*')
            break;
            fos.write(ch);
        }
        fos.close();
    }
}