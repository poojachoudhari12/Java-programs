import java.io.*;

public class CopyImage
{
    public static void main(String[]args)throws Exception{
        FileInputStream fis=new FileInputStream("ss.jpg ");
        FileOutputStream fos=new FileOutputStream("import.jpg ");
        int b=0;
        while(true)
        {
            b=fis.read();
            if(b==-1)
            break;
            fos.write(b);
        }
        fis.close();
        fos.close();
    }
}