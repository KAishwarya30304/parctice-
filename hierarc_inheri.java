// Parent class
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// First subclass
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}

// Second subclass
class Cat extends Animal {
    public void meow() {
        System.out.println("The cat meows.");
    }
}


public class hierarc_inheri {
    public static void main(String[] args) {
        // Object of Dog class
        Dog dog = new Dog();
        dog.eat(); // Inherited from Animal
        dog.bark(); // Specific to Dog

        // Object of Cat class
        Cat cat = new Cat();
        cat.eat(); // Inherited from Animal
        cat.meow(); // Specific to Cat

    }
}
