    
public class CmdArg8
{
    public static void main(String[]args)
    {
        int n=args.length,i=0,pc=0,nc=0,zc=0,oth=0,val=0;
        if(n<2){
            System.out.println("Invalid arguements");
            return;
    }
    for(i=0;i<n;i++)
    {
        try
        {
            val=Integer.parseInt(args[i]);
            if(val==0)
                zc++;
            else
            {
                if(val>0)
                    pc++;
                else
                    nc++;

            }
        }
        catch(Exception e)
        {
            oth++;
        }
    }
    System.out.println("Data Type:"+pc +"\n-ve:"+nc +"\nOs:"+zc +"\nOther:"+oth);

    
    }
}


