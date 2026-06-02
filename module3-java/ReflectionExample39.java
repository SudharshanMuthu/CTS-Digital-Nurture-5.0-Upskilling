class Student {

}

public class ReflectionExample39 {

    public static void main(String[] args) {

        Class<?> cls = Student.class;

        System.out.println(
                cls.getName()
        );

    }
}