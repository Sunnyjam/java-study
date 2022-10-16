package src.main.java.repetitive;

public class ArrayForEach {
    public static void main(String[] args) {
        /*for-each=반복문
        for ( type  반복문안에서지칭할이름  : 반복문을 적용할 배열 {}
         */
        String[] days= {"월","화","수","목","금","토","일"};
        for ( String day : days){
            System.out.println(day+"요일");
        }
    }
}
