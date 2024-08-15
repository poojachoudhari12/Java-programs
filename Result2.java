import javax.swing.*;


class Result2
 {
    int rno;
    int[] mrk;

    
    Result2() 
    {
        rno = 0;
        mrk = new int[5];
    }
    public String toString()
    {
        String b = "Roll no: " + rno + "\nMarks:\n";
        for(int i=0;i<5;i++)
        {
                b=b+mrk[i]+"\n";
        }
        return b;
    }
    
    void display() 
    {
    
        JOptionPane.showMessageDialog(null,toString());
    }

    
    void setData()
     {
        try
        {
           
            String a= JOptionPane.showInputDialog(null, "Enter Roll no:");
         
                rno = Integer.parseInt(a);

                
                for (int i = 0; i < 5; i++)
                 {
                    a = JOptionPane.showInputDialog(null, "Enter Marks for Subject :");
                    mrk[i] = Integer.parseInt(a);
                } 
        } 
            catch (Exception e) 
            {
                //mrk[i]=0;
             }
    }

    int total()
    {
        int tot=0;
        for (int i = 0; i < 5; i++)
        {
            tot+=mrk[i];
        }
        return tot;
    }
    double Average() 
    {
        return total() / 5;
    }

    public static void main(String[] args)
     {
        Result2 a = new Result2();
        a.setData();
        a.display();
        int total=a.total();
        JOptionPane.showMessageDialog(null, "Total: " +total);
        double average = a.Average();
        JOptionPane.showMessageDialog(null, "Average Marks: " + average);
     }
}

