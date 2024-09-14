import java.net.*;
import java.io.*;
class Client3{
    public static void main(String[]args)throws Exception{
        Socket s=new Socket("localhost",4042);
        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enetr source file name");
        String source=br.readLine();
        dos.writeUTF(source);
        boolean result=dis.readBoolean();
        if(result==false)
        {
            System.out.println("File not found");
        }
        else{
            System.out.println("Enetr destination file name");
            String destination=br.readLine();
            int val=0;
            FileOutputStream fos=new FileOutputStream(destination);
            while(true)
            {
                val=dis.read();
                if(val==-1)
                    break;
                fos.write(val);
            }
            fos.close();
        }
        dis.close();
        dos.close();
        s.close();
    }
}