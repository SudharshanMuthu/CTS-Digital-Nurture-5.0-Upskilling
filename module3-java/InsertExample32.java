import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertExample32 {

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
                "INSERT INTO students VALUES(101,'Sudharshan')";

            stmt.executeUpdate(sql);

            System.out.println("Data Inserted");

            con.close();

        }
        catch(Exception e) {

            System.out.println(e);

        }

    }
}