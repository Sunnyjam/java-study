package src.main.java.list;

import java.util.HashSet;
import java.util.Set;

public class CollectionLoop02 {
    public static void main(String[] args) {
        //set을 이용하기, 순서는 보장 되지 않는다.
        HashSet<String> myFavoriteFoods = new HashSet<>();

        myFavoriteFoods.add("치킨");
        myFavoriteFoods.add("피자");
        myFavoriteFoods.add("고구마말랭이");

        for (String food : myFavoriteFoods){
            System.out.println(food+"맛 있어요.");
        }
    }
}
