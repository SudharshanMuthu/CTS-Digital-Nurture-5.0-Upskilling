class Box<T> {

    T value;

    void setValue(T value) {

        this.value = value;

    }

    T getValue() {

        return value;

    }
}

public class GenericsExample41 {

    public static void main(String[] args) {

        Box<String> box1 = new Box<>();

        box1.setValue("Sudharshan");

        System.out.println(box1.getValue());

        Box<Integer> box2 = new Box<>();

        box2.setValue(21);

        System.out.println(box2.getValue());

    }
}