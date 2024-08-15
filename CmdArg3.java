public class CmdArg3 {
    public static void main(String[]args)
    {
        int no=0,i=1,n=args.length;
        if(n!=1)
        {
            System.out.println("Invalide Arg");
            return;
        }
        try {
            no=Integer.parseInt(args[0]);
        } catch (Exception e) {
            System.out.println("Invalide data");
            return;
        }
        String str="Table\n";
        for(i=1;i<=10;i++)
        str=str+" "+(no*i);
        System.out.println(str);
    }
}
