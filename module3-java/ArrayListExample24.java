import java.util.ArrayList;

public class ArrayListExample24 {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Sudharshan");
        students.add("Ravi");
        students.add("Kumar");

        System.out.println("Student List:");

        for(int i = 0; i < students.size(); i++) {

            System.out.println(students.get(i));

        }

    }
}