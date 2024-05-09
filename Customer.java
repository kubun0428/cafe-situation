package exercise.chapter_29.cafe_situation;

public class Customer {
    String mood;
    int cash;

    public Customer(int cash){
        this.mood = ":(\n";
        this.cash = cash;
    }

    void askPrice(Casher casher, String coffee){
        System.out.printf("customer: %s는 얼마인가요?\n", coffee);
        casher.answerPrice(casher.checkPrice(coffee));
    }

    void useCash(int price){
        System.out.printf("customer: 잔액이 %d에서 %d만큼 되었군.\n", cash, cash-price);
        this.cash-=price;
    }

    void orderCoffee(Casher casher, String coffee, boolean takeout){
        System.out.printf("customer: %s를 주문할게요.\n", coffee);
        int price = casher.checkPrice(coffee);
        useCash(price);
        casher.addSales(price);
        if(takeout)
            System.out.println("customer: 테이크아웃 할게요.");
        casher.notifyOrder(coffee, takeout);
        moodChange();
    }

    void moodChange(){
        this.mood = ":)\n";
    }
}
