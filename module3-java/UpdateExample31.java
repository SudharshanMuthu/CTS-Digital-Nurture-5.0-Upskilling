import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateExample32 {

    public static void main(String[] args) {

        try {

            Connection con =
                DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java_db",
                    "root",
                    "root"
                );

            Statement stmt =
                con.createStatement();

            String sql =
                "UPDATE students SET name='Sudar' WHERE id=101";

            stmt.executeUpdate(sql);

            System.out.println("Data Updated");

            con.close();

        }
        catch(Exception e) {

            System.out.println(e);

        }

    }
}