class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    // Method overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class OverridingDemo {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.sound();

        Dog d = new Dog();
        d.sound();

        // Runtime polymorphism
        Animal obj = new Dog();
        obj.sound();
    }
}