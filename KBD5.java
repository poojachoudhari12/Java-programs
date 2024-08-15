import java.util.*;
public class KBD5 
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int[]arr=new int[5];
        int i=0,tot=0;
        while(i<arr.length)
        {
            System.out.println("Arr["+i+"]:");
            arr[i]=s.nextInt();
            tot+=arr[i];
            i++;
        }
        String str="Data\n"+Arrays.toString(arr)+"\ntotal:"+tot;
        System.out.println(str);
        Arrays.sort(arr);
        System.out.println("Data:"+Arrays.toString(arr));
        System.out.println("Search value:");
        int sv=s.nextInt();
        if(Arrays.binarySearch(arr,sv)==-1)
        System.out.println("Not found");
        else
            System.out.println("Found");
    }
}
