package src.main.java.list;

import java.util.ArrayList;
import java.util.List;

public class ListSet {
    public static void main(String[] args) {
        //List에서 값을 변경 = set
        //foods.set(요소의 번호,변경할 값)

        List<String> foods = new ArrayList<>();

        foods.add("파");
        foods.add("피자");
        foods.add("치킨");

        foods.set(0,"콜라");

        System.out.println(foods);
    }
}
