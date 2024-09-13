
import java.io.*;
import java.util.*;
import java.net.*;
class Client1
{
    public static void main(String[]args)throws Exception
    {
        Socket s=new Socket("localhost",2021);
        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        dos.writeUTF("Hello");
        String str=(String)dis.readUTF();//
        System.out.println(" From Server: "+str);
        dos.close();
        dis.close();
        s.close();
    }
}
  