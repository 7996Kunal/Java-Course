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
public class A2 
{
    public static void main(String[] ar)
    {
        try{
                Class.forName("org.gjt.mm.mysql.Driver");
                Connection con;
                con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/db3","root","");
                PreparedStatement stmt;
                stmt=con.prepareStatement("CREATE TABLE EMP(EID INT,ENAME VARCHAR(20),SALARY INT,DESIGNATION VARCHAR(20))");
                stmt.executeUpdate();
                System.out.println("OK");
        }catch(Exception ee){
            System.out.println(ee);
        }
    }
}
