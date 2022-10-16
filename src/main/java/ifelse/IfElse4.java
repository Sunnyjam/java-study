package src.main.java.ifelse;

public class IfElse4 {
    public static void main(String[] args) {
        /* 두 조건 중 일부만 만족해도 실행하기
        논리합 연산자= ||
         */
        int age = 15;
        if ( age <10 || age >= 20){
            System.out.println("10대 아님");
        }else {
            System.out.println("10대");
        }
    }
}
