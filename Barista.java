package exercise.chapter_29.cafe_situation;

public class Barista {
    void notifyCheck(String order, boolean takeout, Casher casher){
        System.out.println("barista: 네, 주문 확인했습니다.");
        Coffee coffee = makeCoffee(order, takeout);
        notifyFinish(coffee, casher);
    }

    Coffee makeCoffee(String coffeeName, boolean takeout){
        Coffee coffee = new Coffee();
        switch (coffeeName){
            case "Americano":
                coffee.made("Americano", 500, "Americano bean", takeout);
                break;
            case "Cafe latte":
                coffee.made("Cafe latte", 400, "Latte bean", takeout);
                break;
            default:
                coffee.made("Default coffee", 300, "just bean", takeout);
        }
        return coffee;
    }

    void notifyFinish(Coffee coffee, Casher casher){
        System.out.println("barista: 커피 다 됐습니다.");
        casher.notifyReady(coffee);
    }
}
