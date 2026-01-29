import java.sql.*;


class Database {
private static final String URL = "jdbc:sqlite:users.db";


public static void init() {
try (Connection c = connect()) {
String sql = "CREATE TABLE IF NOT EXISTS users (" +
"id INTEGER PRIMARY KEY AUTOINCREMENT," +
"username TEXT UNIQUE," +
"password TEXT)";
c.createStatement().execute(sql);
} catch (Exception e) {
e.printStackTrace();
}
}


public static Connection connect() throws SQLException {
return DriverManager.getConnection(URL);
}
}
