package exercise.chapter_29.cafe_situation;

public class Casher {
    int sales;

    public void Casher(){
        this.sales = 0;
    }

    int checkPrice(String coffeeName){
        int price;
        switch (coffeeName){
            case "Americano":
                price = 5000;
                break;
            case "Cafe latte":
                price = 6000;
                break;
            default:
                price = 4000;
        }
        return price;
    }

    void answerPrice(int price){
        System.out.printf("casher: %d 입니다.\n", price);
    }

    void addSales(int price){
        System.out.printf("casher: %d 만큼을 벌었군.\n", price);
        this.sales+=price;
    }

    void notifyOrder(String order, boolean takeout){
        System.out.printf("casher: %s 주문이 들어왔습니다.\n", order);
        Barista barista = new Barista();
        barista.notifyCheck(order, takeout, this);
    }

    void notifyReady(Coffee coffee){
        System.out.printf("casher: %s 커피가 나왔습니다.\n", coffee.name);
        if(coffee.takeOut){
            System.out.println("casher: 테이크아웃 하셨죠? 여기 포장된 커피입니다.");
            coffee.packed();
        }
        else{
            System.out.println("casher: 포장되지 않은 커피이므로 매장에서 드셔야 합니다.");
            System.out.println("<포장되지 않은 커피가 나왔습니다.>");
        }
    }
}
