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
public class A3
{
    public static void main(String[] ar)
    {
        try{
                Class.forName("org.gjt.mm.mysql.Driver");
                Connection con;
                con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/db3","root","");
                PreparedStatement stmt;
                stmt=con.prepareStatement("Insert into emp values(101,'Abhishek Kumar',31000,'CEO')");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Insert into emp values(102,'Ajay Kumar',30000,'Manager')");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Insert into emp values(103,'Atul Kumar',15000,'Executive')");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Insert into emp values(104,'Amit Kumar',15500,'Executive')");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Insert into emp values(105,'Sumit Kumar',16000,'Executive')");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Insert into emp values(106,'Vansh Kumar',16000,'Executive')");
                stmt.executeUpdate();
                System.out.println("OK");
        }catch(Exception ee){
            System.out.println(ee);
        }
    }
}
