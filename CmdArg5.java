public class CmdArg5 {
    
    public static void main(String[]args)
    {
        int n=args.length;
        if(n!=1)
        {
            System.out.println("Invalide Arg");
            return;
        }
        try {
            n=Integer.parseInt(args[0]);
        } catch (Exception e) {
            System.out.println("Invalide data");
            return;
        }
        StringBuffer a= new StringBuffer(args[0]);
        //a is referance variable refers to a class type Stringbuffer
        StringBuffer b=a.reverse();
        System.out.println("Reverse:"+b);
   
    }
}
