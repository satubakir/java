package main;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурка", 3, 10);
        Dog dog = new Dog("Рекс", 5, 2, 20);
        Horse horse = new Horse("Буцефал", 8, 3, 30);

        cat.info();
        cat.run(5);
        cat.swim(2);

        dog.info();
        dog.run(10);
        dog.swim(5);

        horse.info();
        horse.run(15);
        horse.swim(6);
    }
}
