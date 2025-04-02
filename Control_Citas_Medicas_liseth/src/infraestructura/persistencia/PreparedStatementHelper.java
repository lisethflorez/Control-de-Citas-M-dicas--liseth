
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class PreparedStatementHelper {

    private Connection connection;

    public PreparedStatementHelper(Connection connection) {
        this.connection = connection;
    }

    public PreparedStatement createPreparedStatement(String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }
}
