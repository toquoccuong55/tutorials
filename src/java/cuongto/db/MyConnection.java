/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuongto.db;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author toquo
 */
public class MyConnection implements Serializable {

    public MyConnection() {
    }

    public static Connection getMyConnection() throws Exception {
        Connection con = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=EventManager";
        con = DriverManager.getConnection(url, "sa", "12345678");
        return con;
    }
}
