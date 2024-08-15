public class CmdArg6 {
    
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
       String s=new String((new StringBuffer(args[0]).reverse()));
       System.out.println("reverse :"+s);
   
    }
}
