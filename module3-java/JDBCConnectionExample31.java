import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnectionExample31 {

    public static void main(String[] args) {

        String url =
            "jdbc:mysql://localhost:3306/java_db";

        String username = "root";

        String password = "root";

        try {

            Connection con =
                DriverManager.getConnection(
                    url,
                    username,
                    password
                );

            System.out.println(
                "Database Connected Successfully"
            );

            con.close();

        }
        catch(Exception e) {

            System.out.println(e);

        }

    }
}