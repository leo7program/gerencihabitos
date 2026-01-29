import java.sql.*;


class UserService {
public static void register(String user, String pass) {
try (Connection c = Database.connect()) {
String sql = "INSERT INTO users(username,password) VALUES(?,?)";
PreparedStatement ps = c.prepareStatement(sql);
ps.setString(1, user);
ps.setString(2, pass);
ps.execute();
System.out.println("Usuário registrado!\n");
} catch (SQLException e) {
System.out.println("Usuário já existe!\n");
}
}


public static boolean login(String user, String pass) {
try (Connection c = Database.connect()) {
String sql = "SELECT * FROM users WHERE username=? AND password=?";
PreparedStatement ps = c.prepareStatement(sql);
ps.setString(1, user);
ps.setString(2, pass);
ResultSet rs = ps.executeQuery();
return rs.next();
} catch (SQLException e) {
return false;
}
}
}
