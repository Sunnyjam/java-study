package repetitive;

import java.sql.Array;
import java.util.Arrays;

public class ArrayPlus {
    public static void main(String[] args) {
        /*배열에 값 추가하기
        type[] 새로운변수명 = Array.copyOf(변수명, 추가하고 싶은숫자);
        위에있는새로운변수명[마지막숫자] =" ";
         */
        //사용은 인덱스로 하는데 왜 8이 들어가는지 이해가 안가요.
        //
        String[] days= {"월","화","수","목","금","토","일"};
        String[] days2 = Arrays.copyOf(days,8);

        days2[7]="일";

        for (String s : days2){
            System.out.println(s);
        }

    }
}
