// Parent class
class Animal {

    String name = "Animal";

    void eat() {
        System.out.println("Animal eats");
    }
}

// Single inheritance
class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

// Multilevel inheritance
class Puppy extends Dog {

    void play() {
        System.out.println("Puppy plays");
    }
}

// Another child of Animal - Hierarchical inheritance
class Cat extends Animal {

    void meow() {
        System.out.println("Cat meows");
    }
}

class InheritanceDemo {
    public static void main(String[] args) {

        // Puppy inherits Animal -> Dog -> Puppy
        Puppy p = new Puppy();

        System.out.println("Name = " + p.name);
        p.eat();
        p.bark();
        p.play();

        System.out.println();

        // Cat inherits Animal
        Cat c = new Cat();

        c.eat();
        c.meow();
    }
}