public class TypeCasting {

    public static void main(String[] args) {

        int a = 25;

        double b = a;

        System.out.println("Implicit Casting = " + b);

        double x = 99.99;

        int y = (int) x;

        System.out.println("Explicit Casting = " + y);

    }
}

/* 
implicit small to big 
public class TypeCasting {

    public static void main(String[] args) {

        int num = 10;

        double value = num;

        System.out.println("Integer = " + num);

        System.out.println("Double = " + value);

    }
}*/

/*big to small

public class TypeCasting {

    public static void main(String[] args) {

        double num = 10.75;

        int value = (int) num;

        System.out.println("Double = " + num);

        System.out.println("Integer = " + value);

    }
} */