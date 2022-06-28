package entyti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC { private String url = "jdbc:mysql://localhost:3306/baithi" ;

    private String username = "root" ;
    private String pwd = "12345678" ;
    private String connectionUrl = url ;
    public Connection conNec () {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionUrl,username,pwd) ;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
