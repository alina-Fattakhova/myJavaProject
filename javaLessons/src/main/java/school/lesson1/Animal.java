package school.lesson1;

public abstract class Animal {
    String name;
    static int animalCounter;

    public Animal(String name) {
        this.name = name;
        animalCounter++;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);
}

class Cat extends Animal {
    static int catCounter;

    public Cat(String name) {
        super(name);
        catCounter++;
    }

    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " метров. ");
        } else {
            System.out.println("Слишком большая дистанция!");
        }
    }

    public void swim(int distance) {
        System.out.println("Коты не плавают!");
    }
}

class Dog extends Animal {
    static int dogCounter;

    public Dog(String name) {
        super(name);
        dogCounter++;
    }

    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(name + " пробежал " + distance + " метров.");
        } else {
            System.out.println("Слишком большая дистанция!");
        }
    }

    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(name + " проплыл " + distance + " метров.");
        } else {
            System.out.println("Слишком большая дистанция!");
        }
    }

    public static void main(String[] args) {
        Dog Bobik = new Dog("Bobik");
        Bobik.swim(80);
        Bobik.run(150);
        Cat murzik = new Cat("Murzik");
        murzik.swim(75);
        murzik.run(64);
        System.out.println(Animal.animalCounter);
        System.out.println(Cat.catCounter);
        System.out.println(Dog.dogCounter);
    }
}