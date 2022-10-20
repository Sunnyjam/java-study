package src.main.java.list;

import java.util.ArrayList;

public class Contains01 {
    public static void main(String[] args) {
       /* contains= 값이 존재하는 지 여부를 확인
          contains의 사용은 값을 추가하기 전에 이 값이 존재하는지 여부를 확인할 때 사용됨.
         - boolean contiansChicken = foods.contains("치킨");
        */
        ArrayList<String> foods = new ArrayList<String>();

        foods.add("뿌링클");
        foods.add("엽떡");
        foods.add("핫도그");

        boolean containsChicken = foods.contains("뿌링클");
        System.out.println("목록에 치킨이 있는가? :"+containsChicken);
    }
}
