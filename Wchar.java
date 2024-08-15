import java.io.*;

class Wchar
{
    public static void main(String[]args)throws Exception
    {
        FileWriter fw=new FileWriter("abc.txt");
        System.out.println("Type characters:\n");
        while(true)
        {
            char ch=(char)System.in.read();
            System.in.skip(5);
            if(ch=='*')
            break;
            fw.write(ch);
        }
        fw.close();
    }
}