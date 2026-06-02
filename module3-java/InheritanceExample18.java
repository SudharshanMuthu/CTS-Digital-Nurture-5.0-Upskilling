class Animal {

    void makeSound() {

        System.out.println("Animal Makes Sound");

    }
}

class Dog extends Animal {

    void makeSound() {

        System.out.println("Bark");

    }
}

public class InheritanceExample18 {

    public static void main(String[] args) {

        Animal a = new Animal();

        Dog d = new Dog();

        a.makeSound();

        d.makeSound();

    }
}