package src.main.java.repetitive;

import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args) {
        /*배열을 통으로 출력하기
        System.out.println(배열의 변수명);
        System.out.println(Arrays.toString(배열의 변수명));
         */

        String[] days= {"월","화","수","목","금","토","일"};

        System.out.println(days);
        System.out.println(Arrays.toString(days));
    }
}
