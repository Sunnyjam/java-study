package src.main.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample01 {
    /*-List는 쉽게 목록에서 데이터를 추가,제거 가능
      -Listd에는 add라는 메소드가 존재
       -dd메소드를 호출하면 매개변수로 목록에서 사용하는 타입의 데이터를 입력하면 목록에 데이터가 추가된다.
       -프로그램을 돌리면 목록 형태의 자료를 나타내기 위해 [] 대괄호로 출력된다.
       -List는 원시형데이터(int,double,boolean)을 사용할 수 없다.
        int == Integer : ArrayList<Integer>
        double == Double : ArrayList<Double>
        boolean == Boolean : ArrayList<Boolean>
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //add - list의 요소에 추가
        list.add("치킨");
        list.add("피자");

        /*list.remove의 사용법은 2가지
        -1.list.remove("치킨") ,String이면 "치킨" 값을 그대로 넣는 방법
        -2.list.remove(0), index사용
         */
        list.remove(0);

        System.out.println(list);
    }
}
