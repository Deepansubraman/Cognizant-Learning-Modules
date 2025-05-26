import java.sql.*;

class TransactionHandling {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:bank.db");
            con.setAutoCommit(false);
            PreparedStatement debit = con.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
            PreparedStatement credit = con.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?");
            debit.setInt(1, 100);
            debit.setInt(2, 1);
            credit.setInt(1, 100);
            credit.setInt(2, 2);
            debit.executeUpdate();
            credit.executeUpdate();
            con.commit();
            debit.close();
            credit.close();
            con.close();
        } catch (Exception e) {
            try {
                Connection con = DriverManager.getConnection("jdbc:sqlite:bank.db");
                con.rollback();
                con.close();
            } catch (Exception ex) {}
            System.out.println("Transaction failed");
        }
    }
}
