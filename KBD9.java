import java.io.*;
public class KBD9 {
    public static void main(String[] args) {
        InputStreamReader isr=null;
        BufferedReader br=null;
        try{
            isr=new InputStreamReader(System.in);
            br=new BufferedReader(isr);
        }
        catch(Exception e) {}
        int no=0;
        System.out.println("Enter Number:");
        try{
            no=Integer.parseInt(br.readLine());
        }
        catch(Exception e)
        {
            System.out.println("Invalide input");
            return;
        }
        System.out.println("Number:"+no);                           
        
    }
}
