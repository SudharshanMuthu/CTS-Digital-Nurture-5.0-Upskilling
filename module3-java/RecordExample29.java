record Student(int id, String name) {}

public class RecordExample29 {

    public static void main(String[] args) {

        Student s1 =
                new Student(101, "Sudharshan");

        System.out.println("ID : " + s1.id());

        System.out.println("Name : " + s1.name());

    }
}