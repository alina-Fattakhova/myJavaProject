package school.lesson1;

public class Payment {
    Item[] items;

    double countTotalPrice() {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.price;
        }
        return totalPrice;
    }

    static class Item {
        String name;
        double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }
}

class PaymentTest {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.items = new Payment.Item[3];
        payment.items[0] = new Payment.Item("Bread", 10.50);
        payment.items[1] = new Payment.Item("Butter", 30.00);
        payment.items[2] = new Payment.Item("Milk", 12.25);
        System.out.println("Total price of three items: "+ payment.countTotalPrice());
    }
}