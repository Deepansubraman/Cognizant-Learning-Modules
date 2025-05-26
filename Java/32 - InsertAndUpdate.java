import java.sql.*;

class StudentDAO {
    Connection con;

    public StudentDAO() throws SQLException {
        con = DriverManager.getConnection("jdbc:sqlite:students.db");
    }

    public void insertStudent(int id, String name) throws SQLException {
        PreparedStatement ps = con.prepareStatement("INSERT INTO students (id, name) VALUES (?, ?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.executeUpdate();
        ps.close();
    }

    public void updateStudent(int id, String name) throws SQLException {
        PreparedStatement ps = con.prepareStatement("UPDATE students SET name = ? WHERE id = ?");
        ps.setString(1, name);
        ps.setInt(2, id);
        ps.executeUpdate();
        ps.close();
    }
}

class InsertAndUpdate{
    public static void main(String[] args) throws SQLException {
        StudentDAO dao = new StudentDAO();
        dao.insertStudent(1, "Alice");
        dao.updateStudent(1, "Alicia");
    }
}
