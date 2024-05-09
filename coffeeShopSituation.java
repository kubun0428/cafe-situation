package exercise.chapter_29.cafe_situation;

public class coffeeShopSituation {
    public static void main(String[] args) {
        Casher casher = new Casher();

        Customer customer1 = new Customer(5000);
        customer1.askPrice(casher, "Americano");
        customer1.askPrice(casher, "Cafe latte");
        customer1.orderCoffee(casher, "Other", true);
        System.out.println(customer1.mood+"\n");

        Customer customer2 = new Customer(12000);
        customer2.orderCoffee(casher, "Americano", false);
        customer2.orderCoffee(casher, "Cafe latte", false);
        System.out.println(customer2.mood+"\n");

        System.out.printf("야호! %d원 벌었다!", casher.sales);
    }
}