import java.sql.*;

class JDBCconnection{
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:students.db");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Database error");
        }
    }
}
