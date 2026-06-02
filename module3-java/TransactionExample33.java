import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionExample33 {

    public static void main(String[] args) {

        Connection con = null;

        try {

            con =
                DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java_db",
                    "root",
                    "root"
                );

            con.setAutoCommit(false);

            Statement stmt =
                con.createStatement();

            stmt.executeUpdate(
                "UPDATE accounts " +
                "SET balance = balance - 1000 " +
                "WHERE id = 1"
            );

            stmt.executeUpdate(
                "UPDATE accounts " +
                "SET balance = balance + 1000 " +
                "WHERE id = 2"
            );

            con.commit();

            System.out.println(
                "Transaction Successful"
            );

        }
        catch(Exception e) {

            try {

                con.rollback();

                System.out.println(
                    "Transaction Rolled Back"
                );

            }
            catch(Exception ex) {

                System.out.println(ex);

            }

        }

    }
}