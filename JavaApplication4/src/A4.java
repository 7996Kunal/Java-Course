/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author Administrator
 */
public class A4
{
    public static void main(String[] ar)
    {
        try{
                Class.forName("org.gjt.mm.mysql.Driver");
                Connection con;
                con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/db3","root","");
                PreparedStatement stmt;
                stmt=con.prepareStatement("Select * from emp where eid=103");
                ResultSet rs=stmt.executeQuery();
                if(rs.next())
                {
                    String s1=rs.getString(1);
                    String s2=rs.getString(2);
                    String s3=rs.getString("salary");
                    String s4=rs.getString("designation");
                    System.out.println(s1+","+s2+","+s3+","+s4);
                }
                else
                {
                    System.out.println("No Data");
                }
        }catch(Exception ee){
            System.out.println(ee);
        }
    }
}
