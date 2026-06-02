import java.util.HashMap;

public class HashMapExample25 {

    public static void main(String[] args) {

        HashMap<Integer, String> students =
                new HashMap<>();

        students.put(101, "Sudharshan");
        students.put(102, "Ravi");
        students.put(103, "Kumar");

        System.out.println("Student 101 : "
                + students.get(101));

        System.out.println("Student 102 : "
                + students.get(102));

        System.out.println("Student 103 : "
                + students.get(103));

    }
}