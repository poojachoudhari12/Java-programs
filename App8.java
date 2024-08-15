public class App8 {
    public static void main(String[]args)
    {
        int n=(int)(Math.random()*100);
        System.out.println("No: "+n);
        String str=Integer.toBinaryString(n);
        System.out.println("Binary String: "+str);
        str=Integer.toOctalString(n);
        System.out.println("Octal String: "+str);
        str=Integer.toHexString(n);
        System.out.println("Hex String: "+str);
        str=Integer.toString(n);
        System.out.println(str);

    }
}
