package school.lesson1;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    float maxWeight = 100.0f;
    float currentWeight = 0;
    ArrayList<T> fruits = new ArrayList<>();

    void addFruit(T fruit) {
        if (currentWeight + fruit.weight <= maxWeight) {
            fruits.add(fruit);
            currentWeight += fruit.weight;
//            System.out.println("Fruit has been added. Current weight of the box=" + currentWeight);
        } else
            System.out.println("Cannot add fruit. The box is full");
    }

    public float getWeight() {
        return currentWeight;
    }

    public void moveFruitsToGivenBox(Box<T> targetBox) {
        targetBox.fruits.addAll(this.fruits);
        targetBox.currentWeight = this.currentWeight;
        this.fruits.clear();
        this.currentWeight = 0;
    }

    public boolean compare(Box<? extends Fruit> box) {
        return this.currentWeight == box.currentWeight;
    }


    public static void main(String[] args) {
        Box<Apple> boxApple = new Box<>();
        for (int i = 0; i < 75; i++) {
            boxApple.addFruit(new Apple());
        }

        Box<Orange> boxOrange = new Box<>();
        for (int i = 0; i < 50; i++) {
            boxOrange.addFruit(new Orange());
        }

        Box<Orange> boxOrange2 = new Box<>();


        //Тестирование метода определения веса коробки
        System.out.println(boxOrange.getWeight());

        //Тестирование метода перекладывания из коробки в коробку
        boxOrange.moveFruitsToGivenBox(boxOrange2);
        System.out.println("boxOrange's weight= " + boxOrange.getWeight());
        System.out.println("boxOrange2's weight= " + boxOrange2.getWeight());

        //Тестирование метода сравнения 2 коробок
        System.out.println(boxOrange2.compare(boxApple));

    }
}

