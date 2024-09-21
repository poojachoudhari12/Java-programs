import java.io.*;
import java.net.*;
public class Client5 extends Thread 
{
    DataInputStream dis;
    DataOutputStream dos;
    BufferedReader br;
    String cnm,str;
    Socket s;
    Client5(String cnm)throws Exception
    {
        super(cnm);
        this.cnm=cnm;
        br=new BufferedReader(new InputStreamReader(System.in));
        s=new Socket("localhost",3030);
        dis=new DataInputStream(s.getInputStream());
        dos=new DataOutputStream(s.getOutputStream());
        dos.writeUTF(cnm);
        start();
    }
    public void run()
    {
        try{
            doChat();
        }
        catch(Exception e){}
    }
    synchronized void doChat()throws Exception
    {
        while(true)
        {
            System.out.println("Msg to Server:");
            str=br.readLine();
            dos.writeUTF(str);
            if(str.equals("Bye"))
              break;
              System.out.println("From Server :"+dis.readUTF());

        }
    }
    public static void main(String[] args)throws Exception
    {
        if(args.length!=1)
            return;
        Client5 a=new Client5(args[0]);     
    }
}
