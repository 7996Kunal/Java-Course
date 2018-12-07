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
public class A1 
{
    public static void main(String[] ar)
    {
        try{
                Class.forName("org.gjt.mm.mysql.Driver");
                Connection con;
                con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/db3","root","");
                System.out.println("OK");
        }catch(Exception ee){
            System.out.println(ee);
        }
    }
}
