package school.lesson1;

public class Park {
    Amusement[] amusements;

    void showParkInfo(){
        System.out.println("There are " + amusements.length + " amusements in the park: ");
        for (Amusement amusement : amusements) {
            System.out.println("Name:" + amusement.name + ", price: " + amusement.price +
                    ", works from " + amusement.openingHour + " to " + amusement.closingHour);
        }
    }

    static class Amusement {
        String name;
        int openingHour;
        int closingHour;
        double price;

        public Amusement(String name, int openingHour, int closingHour, double price) {
            this.name = name;
            this.openingHour = openingHour;
            this.closingHour = closingHour;
            this.price = price;
        }
    }

}

class ParkTest{
    public static void main(String[] args) {
        Park park = new Park();
        park.amusements = new Park.Amusement[2];
        park.amusements[0] = new Park.Amusement("Merry-go-round", 10, 15, 2.50);
        park.amusements[1] = new Park.Amusement("Swing", 9, 18, 0.00);
        park.showParkInfo();
    }
}

