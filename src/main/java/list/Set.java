package src.main.java.list;

import java.util.HashSet;

public class Set {
    /*List = 중복값을 허용한다
      Set = 중복값을 허용하지 않는다.
      Set<String> set = new HasSet<String>();
      Set 과 HasSet은 부모과 자식관계
      Set의 목적은 중복되지 않는 목적을 만들고 관리하는 것
      Set = 중복과 제거를 할 수 있다.다만 중복을 허용하지 않기 때문에 중복해서 데이터를 추가하는 경우 무시하게 된다.
     */
    public static void main(String[] args) {
        java.util.Set<String> foods = new HashSet<>();

        foods.add("치킨");
        foods.add("피자");
        foods.add("치킨");

        foods.remove("치킨");
        System.out.println(foods);
    }
}
