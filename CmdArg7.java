public class CmdArg7
{
    public static void main(String[]args)
    {
        int n=args.length,i=0;
        if(n<2){
            System.out.println("Invalid arguements");
            return;
    }
    int sindex= n-1;
    while(i<sindex)
    {
        if(args[i].equals(args[sindex]))
            break;
        i++;
    }
    if(i==sindex)
        System.out.println("Not Found");
    else
        System.out.println("Found at position"+i);
    }
}

