package src.main.java.repetitive;

import java.util.Arrays;

public class ArrayTwoDimension {
    public static void main(String[] args) {
        /*2차원 배열
        String[][] 변수명 ={ {},
                            {},
                            {}
                            };
    System.out.println(Arrays.toString(변수명[0]));
    System.out.println(Arrays.toString(변수명[1]));
    System.out.println(Arrays.toString(변수명[2]));
    System.out.println(변수명[줄인덱스][배열인덱스]);

       앞의 대괄호는 줄번호(인덱스사용), 뒤의 대괄호는 괄호안에번호(인덱스사용)
         */

        String[][] days = {
                {"월","화","수","목","금","토","일"},
                {"일","화","수","목","금","토","일"},
                {"월","화","수","목","금","금","금"}
        };

        System.out.println(Arrays.toString(days[0]));
        System.out.println(Arrays.toString(days[1]));
        System.out.println(Arrays.toString(days[2]));

        System.out.println(days[2][6]);
    }
}
