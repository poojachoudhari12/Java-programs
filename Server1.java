
import java.io.*;
import java.util.*;
import java.net.*;
class Server1
{
    public static void main(String[]args)throws Exception
    {
        ServerSocket ss=new ServerSocket(2021);
        System.out.println("Server Started.....");
        Socket s=ss.accept();
        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        String str=(String)dis.readUTF();//
        System.out.println(" From Client Said: "+str);
        str="Welcomes U";
        dos.writeUTF(str);
        dos.close();
        dis.close();
        s.close();

    }
}
  