package edu.erciyes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest
{

    private static Statement statement;

    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        initDatabase();
        signIn("test1","madamada");
        signIn("test2","madamada");

        //loading driver
        //Class.forName("com.mysql.jdbc.Driver");
        //Establish Connection
        /*
        String conString = "jdbc:mysql://127.0.0.1:3306/?user=root&password=goksel38";
        Connection conn =  DriverManager.getConnection(conString);
        String query = "desc fruitjanissary.musteri";
        //String query = "select * from fruitjanissary.musteri;";
        statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next())
            System.out.println(resultSet.getString(1)+" ,"+resultSet.getString(2)+" ,"+resultSet.getString(3));*/
    }

    private static void initDatabase() throws SQLException
    {
        String conString = "jdbc:mysql://127.0.0.1:3306/?user=root&password=goksel38";
        Connection conn = DriverManager.getConnection(conString);
        statement = conn.createStatement();
        //String query = "select * from fruitjanissary.musteri;";
    }

    private static void signIn(String name, String pass) throws SQLException
    {
        String query = "insert into fruitjanissary.users (nickname,password) values ('" + name + "','" + pass + "');";
        //String query2 = String.format("insert into fruitjanissary.users (nickname,password) values ('%s','%s');", name, pass);
        statement.executeUpdate(query);

    }
}
