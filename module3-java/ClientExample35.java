import java.net.Socket;

public class ClientExample35 {

    public static void main(String[] args) {

        try {

            Socket socket =
                    new Socket(
                            "localhost",
                            5000
                    );

            System.out.println(
                    "Connected To Server"
            );

            socket.close();

        }
        catch(Exception e) {

            System.out.println(e);

        }

    }
}