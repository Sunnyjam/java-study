package src.main.java.ifelse;

public class ElseIf {
    public static void main(String[] args) {
        // else if 조건 추가하기.
        int money = 5000;
        if(money >= 8000){
            System.out.println("크로플 배달시키기.");
        }else if (money >= 5000){
            System.out.println("빵집 배달시키기.");
        } else {
            System.out.println("방문 포장.");
        }

    }
}
