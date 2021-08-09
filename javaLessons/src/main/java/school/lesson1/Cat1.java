package school.lesson1;

public class Cat1 {
    private final String name;
    private final int appetite;
    boolean isFull;

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isFull() {
        return isFull;
    }

    public Cat1(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        p.decreaseFood(this);
    }
}

class Plate {
    int food;

    public Plate(int food) {
        this.food = food;
    }

    int getFood() {
        return food;
    }

    public void decreaseFood(Cat1 cat) {
        if (food >= cat.getAppetite()) {
            food -= cat.getAppetite();
            System.out.println(cat.getName() + " съел " + cat.getAppetite() + " еды. Осталось еды в тарелке: " + food);
            cat.isFull = true;
        } else {
            System.out.println(cat.getName() + "(у) не хватило еды в тарелке.");
        }
    }

    public void increaseFood(int extraFood) {
        food += extraFood;
    }

    public void info() {
        System.out.println("plate: " + food);
    }


}

class PlateTest {
    public static void main(String[] args) {
        Cat1[] cats = new Cat1[3];
        cats[0]= new Cat1("Мурзик", 25);
        cats[1]= new Cat1("Барсик",96);
        cats[2]=new Cat1("Снежок", 102);

        Plate plate = new Plate(150);
        for (Cat1 cat : cats) {
            cat.eat(plate);
            System.out.println(cat.getName() + " сытый? - " + cat.isFull());
        }
    }
}

