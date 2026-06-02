import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class SelectExample32 {

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

            ResultSet rs =
                stmt.executeQuery(
                    "SELECT * FROM students"
                );

            while(rs.next()) {

                System.out.println(
                    rs.getInt("id")
                    + " "
                    + rs.getString("name")
                );

            }

            con.close();

        }
        catch(Exception e) {

            System.out.println(e);

        }

    }
}