package src.main.java.list;

import java.util.ArrayList;
import java.util.List;

public class CollectionLoop01 {
    public static void main(String[] args) {
        //반복문에서 컬렉션 사용하기
        List<String> foods = new ArrayList<>();

        foods.add("치킨");
        foods.add("피자");
        foods.add("고구마말랭이");

        for (String food : foods){
            System.out.println(food+"맛있어요.");
        }
    }
}
