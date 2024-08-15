public class App7 {
    public static void main(String[] args) {
        int i=2,n=10;
        String str="Prime Number\n";
        while(n<=100)
        {
            for(i=2;i<n;i++)
            {
                if(n%i==0)
                break;
            }
            if(i==n)
            str=str+" "+n;
            n++;
               }
              System.out.println(str); 
    }
}
