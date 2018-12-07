
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class DB 
{
    public static void main(String[] ar)
    {
        try{
                Class.forName("org.gjt.mm.mysql.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/db3","root","");
                PreparedStatement stmt;
                stmt=con.prepareStatement("Create Table Products(pid int,name varchar(20),packing varchar(20),price int)");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Create Table Customers(cid int,name varchar(20),address varchar(20),mobile varchar(10))");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Create Table Orders(oid int,cname varchar(20),odate date,totalamt int)");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Create Table OrderDetails(oid int,pname varchar(20),price int,qty int,amt int)");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Insert into Products values(101,'Keyboard','1 Pc',250)");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Insert into Products values(102,'Mouse','1 Pc',150)");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Insert into Products values(103,'Monitor','14 inch',4500)");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Insert into Products values(104,'CPU 3 Ghz','Intel Box',8500)");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Insert into Customers values(1,'Abhinav Kumar','Meerut City','8569898547')");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Insert into Customers values(2,'Rajat Kumar','Meerut City','7458965879')");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Insert into Customers values(3,'Sumit Kumar','Noida City','9896587487')");
                stmt.executeUpdate();
                System.out.println("Done");
        }catch(Exception ee){}
    }
}
