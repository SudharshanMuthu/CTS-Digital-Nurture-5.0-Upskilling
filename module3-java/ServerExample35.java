import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample35 {

    public static void main(String[] args) {

        try {

            ServerSocket server =
                    new ServerSocket(5000);

            System.out.println(
                    "Server Started..."
            );

            Socket socket =
                    server.accept();

            System.out.println(
                    "Client Connected"
            );

            server.close();

        }
        catch(Exception e) {

            System.out.println(e);

        }

    }
}