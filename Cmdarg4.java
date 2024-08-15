
public class Cmdarg4 {
    public static void main(String[] args) {
        int no=0,n=args.length,rev=0;
        if(n!=1)
        {
            System.out.println("Invalide Arguments");
            return;
        }
        try {
            no=Integer.parseInt(args[0]);
        } catch (Exception e) {
            System.out.println("Invalide ");
            return;
        }
        System.out.println("No: "+n);
        while(no>0)
        {
            rev=rev*10+(no%10);
            no/=10;

        }
        System.out.println("reverse:"+rev);
    }
}