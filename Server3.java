import java.io.*;
import java.net.*;
class Server3{
    public static void main(String[] args)throws Exception
    {
        ServerSocket ss=new ServerSocket(4042);
        System.out.println("Server Started");
        Socket s=ss.accept();
        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        String source=dis.readUTF();//reds source file name send by client
        boolean result=(new File(source)).exists();
        dos.writeBoolean(result);//sends true if file found
        if(result==false)
        {
            dos.close();
            dis.close();
            s.close();
            return;
        }
        FileInputStream fis=new FileInputStream(source);
        int val=(int)0;
        while(true)
        {
            val=fis.read();
            if(val==-1)
                break;
          dos.write(val);
        }
        fis.close();
        dis.close();
        dos.close();
        s.close();
    }
}