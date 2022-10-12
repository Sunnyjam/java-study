package repetitive;

public class Array {
    public static void main(String[] args) {
        /*배열이란?
        같은 자료형들이 모인 목록이다. 반복문과의 조합이 좋다.
        배열을 선언했을 때 그 안의 값을 사용하기 위해서 배열은 요소에 접근할 수 있도록 인덱스라는 개념을 제공한다.
        월 화 수 목 금 토 일
        0  1  2  3 4 5 6
        요일 아래의 숫자가 인덱스
        type[] 변수명 = { value1,value2,value3...,valueN};
        System.out.println(변수명[인덱스번호]);
         */

        String[] days= {"월","화","수","목","금","토","일"};
        System.out.println(days[0]);
        System.out.println(days[6]);

    }
}
