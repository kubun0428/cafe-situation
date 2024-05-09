package exercise.chapter_29.cafe_situation;

public class Coffee {
    String name;
    int water;
    String coffeeBeans;
    boolean takeOut;

    void made(String name, int water, String coffeeBeans, boolean takeout){
        this.name = name;
        this.water = water;
        this.coffeeBeans = coffeeBeans;
        this.takeOut = takeout;
    }

    void packed(){
        System.out.println("<포장된 커피가 나왔습니다.>");
    }
}
