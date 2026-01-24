class Animal {
    void sound() {
    };
}

class Dog extends Animal {
    void sound() {
        System.out.println("woof");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("meow");
    }
}

public class Exp13 {
    public static void main(String args[]) {
        Animal a = new Cat();
        a.sound();
        Animal b = new Dog();
        b.sound();
    }
}
