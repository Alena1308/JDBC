package sky.project.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ApplicationConnection {
    private Connection getConnection() throws SQLException {
        String url = "jdbs:postgresql://localhost:5433/skypro";
        String username = "postgres";
        String password = "4414";
        return DriverManager.getConnection(url,username,password);
    }

    public PreparedStatement getPreparedStatement (String sql) throws SQLException {
        return getConnection().prepareStatement(sql);
    }
}
