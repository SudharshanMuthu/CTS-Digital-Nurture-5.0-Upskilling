interface Add {

    int sum(int a, int b);

}

public class LambdaAddition27 {

    public static void main(String[] args) {

        Add a = (x, y) -> x + y;

        System.out.println(a.sum(10, 20));

    }
}