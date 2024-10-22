import java.sql.*;

import mypkg.Util;

public class InsertTrade1 {
    public static void main(String[] args) throws Exception 
    {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data24", "root", "");
        int id = 0;
        String nm = "";
        PreparedStatement ps = con.prepareStatement("insert into trade values(?,?)");
        PreparedStatement ps1 = con.prepareStatement("Select * From Trade where tid=?");
        while (true) {
            id = Util.iInput("Enter trade ID");
            if (id == 0)
                break;
                ps1.setInt(1,id);
                ResultSet rs=ps1.executeQuery();
                if(rs.next()==true)
                {
                    Util.display("Record Exits");
                    continue;
                }
            nm = Util.sInput("Enter trade name");
            ps.setInt(1, id);
            ps.setString(2, nm);
            ps1.executeUpdate();
            System.out.println("Row Inserted");
        }
        con.close();
    }

}
