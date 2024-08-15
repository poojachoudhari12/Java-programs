import java.io.*;
class KBD8
{
    public static void main(String[] args) {
        InputStreamReader isr=null;
        BufferedReader br=null;
        try{
            isr=new InputStreamReader(System.in);
            br=new BufferedReader(isr);

        }
        catch(Exception e){}
        System.out.println("String");
        try{
           String str=br.readLine();
        }
        catch(Exception e){}
       System.out.println(isr);
        

    }
}