import java.sql.*;

import mypkg.Util;

public class ModifyTrade {
    public static void main(String[] args) throws Exception 
    {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data24", "root", "");
        int id = 0;
        String nm = "";
        PreparedStatement ps = con.prepareStatement("Update Trade set tnm=? Where tid=?");
        PreparedStatement ps1 = con.prepareStatement("Select * From Trade where tid=?");
        while (true) {
            id = Util.iInput("Enter trade ID");
            if (id == 0)
                break;
                ps1.setInt(1,id);
                ResultSet rs=ps1.executeQuery();
                if(rs.next()==false)
                {
                    Util.display("Record Not Exits");
                    continue;//
                }
            nm = Util.sInput("Enter trade name");
            ps.setString(1, nm);
            ps.setInt(2, id);
            ps1.executeUpdate();//
            System.out.println("Row Modified");
        }
        con.close();
    }

}
