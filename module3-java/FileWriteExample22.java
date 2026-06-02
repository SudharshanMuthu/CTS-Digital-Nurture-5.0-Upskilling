import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample22 {

    public static void main(String[] args) {

        try {

            FileWriter writer =
                new FileWriter("student.txt");

            writer.write(
                "Welcome to Java File Handling"
            );

            writer.close();

            System.out.println(
                "File Written Successfully"
            );

        }
        catch(IOException e) {

            System.out.println(
                "Error Writing File"
            );

        }

    }
}