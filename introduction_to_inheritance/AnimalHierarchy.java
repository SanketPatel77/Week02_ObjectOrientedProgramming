// Animal class (superclass)
class Animal {
    // create name and age attributes
    private String name;
    private int age;

    // constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // method make sound of animal
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public void displayInfo() {
        System.out.println("Name :" + name + ", Age :" + age);
    }

}

// Dog class (subclass that extend Animal class)
class Dog extends Animal {
    // constructor
    Dog(String name, int age) {
        super(name, age);

    }

    // overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println("Dog Bark");
    }
}

// Cat class (subclass that extend Animal class)
class Cat extends Animal {
    // constructor
    Cat(String name, int age) {
        super(name, age);

    }

    // overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println("Cat Meow Meow");
    }
}

// Bird class (subclass that extend Animal class)
class Bird extends Animal {
    // constructor
    Bird(String name, int age) {
        super(name, age);

    }

    // overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println("Bird Chirp Chirp");
    }
}

// class with method main
public class AnimalHierarchy {
    public static void main(String[] args) {
        // creat object of Dog, Cat, and Bird class
        Animal dog = new Dog("Blacky", 5);
        Animal cat = new Cat("Kitty", 2);
        Animal bird = new Bird("rimjhim", 1);

        // call for Dog class information
        dog.displayInfo();
        dog.makeSound();

        // call for Cat class information
        cat.displayInfo();
        cat.makeSound();

        // call for Bird class information
        bird.displayInfo();
        bird.makeSound();
    }

}