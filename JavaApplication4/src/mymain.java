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
public class mymain {
    public static void main(String[] ar)
    {
        try{
                Class.forName("org.gjt.mm.mysql.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/db3","root","");
                Frame3 f=new Frame3();
                f.setVisible(true);
        }catch(Exception ee){
            try{
                    Class.forName("org.gjt.mm.mysql.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1","root","");
                    PreparedStatement stmt=con.prepareStatement("Create Database db3");
                    stmt.executeUpdate();
                    stmt=con.prepareStatement("use db3");
                    stmt.executeUpdate();
                    stmt=con.prepareStatement("CREATE TABLE EMP(EID INT,ENAME VARCHAR(20),SALARY INT,DESIGNATION VARCHAR(20))");
                    stmt.executeUpdate();
                    stmt=con.prepareStatement("CREATE TABLE Users(ULogin VARCHAR(20),upass VARCHAR(20))");
                    stmt.executeUpdate();
                    stmt=con.prepareStatement("Insert into users values('admin','admin123')");
                    stmt.executeUpdate();
                    Frame3 f=new Frame3();
                    f.setVisible(true);
            }catch(Exception e){}
        }
    }
}
