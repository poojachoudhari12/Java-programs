public class CmdArg2 {
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
        System.out.println("No: "+n);
    }
}