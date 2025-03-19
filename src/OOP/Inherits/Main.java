package OOP.Inherits;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        Tree tree = new Tree();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(tree.isAlive);
        dog.eat();
        cat.eat();

        dog.speak();
        cat.speak();

        tree.photsynthesize();

    }
}
