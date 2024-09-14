import java.io.*;
import java.net.*;
public class Client2new {
    public static void main(String[] args) throws Exception
     {

        if(args.length!=1)
        {
            System.out.println("invalid arguments");
            return;
        }
        Socket s=new Socket("localhost",5152);

        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        DataInputStream dis=new DataInputStream(s.getInputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        dos.writeUTF(args[0]);//sends client name to the server
        String str=dis.readUTF();//reads respond by server
        System.out.println("from server:"+str);
        while(true)
        {
            System.out.println("messeage to server:");
            str=br.readLine();
            dos.writeUTF(str);//sends messeage to server
            if(str.equals("bye"))
            break;
            str=dis.readUTF();//reads messeage sent bye server
            System.out.println("from server: "+str);
            if(str.equals("bye"))
            break;

        }
        dos.close();
        dis.close();
        s.close();
    }
}