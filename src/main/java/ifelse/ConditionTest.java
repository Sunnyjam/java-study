package src.main.java.ifelse;

public class ConditionTest {
    // red 일 경우 사과 출력
    // yellow 일 경우 바나나 출력
    // 해당 안될경우 없음 출력
    // method


    // main
    public static void main(String[] args) {
        fruit("Red");
        fruit("Yellow");
        fruit("없음");
    }

    public static void fruit (String name){
        String[] colors = {"Red", "Yellow"};

        if( colors[0].equals(name)){
            System.out.println("사과");
        } else if ( colors[1].equals(name)) {
            System.out.println("바나나");
        }else {
            System.out.println("없음");
        }
    }
}
