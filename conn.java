package Employeee;


//Database Name ------ project
//Table Name ---------- employee,login(username,password) 
//login(username,password)------(admin,admin)


import java.sql.*;

public class conn{
    
    public Connection c;
    public Statement s;
 
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/project","root","root");
            s = c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
 
