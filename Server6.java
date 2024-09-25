import java.io.*;
import java.net.*;
import java.util.*;

public class Server6 extends Thread {
    ServerSocket ss;
    LinkedList<DataOutputStream> cls;
    String msg;
    Socket s;
    DataOutputStream dos;
    BufferedReader br;

    Server6() throws Exception {
        super("Server");
        ss = new ServerSocket(7071);
        cls = new LinkedList<DataOutputStream>();
        br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            s = ss.accept();
            cls.add(new DataOutputStream(s.getOutputStream()));
            if (cls.size() == 1)
                start();
        }
    }

    public void run() {
        int i = 0, k;
        while (true) {
            System.out.println("Enter Message:");
            try {
                msg = br.readLine();
            } catch (Exception e) {
            }
            i = 0;
            k = cls.size();
            while (i < k) {
                dos = cls.get(i);
                try {
                    dos.writeUTF(msg);
                } catch (Exception e) {
                }
                i++;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Server6 a = new Server6();
    }
}
