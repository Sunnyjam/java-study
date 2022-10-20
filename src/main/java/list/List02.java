package src.main.java.list;

import java.util.ArrayList;
import java.util.List;

public class List02 {
    public static void main(String[] args) {
        List<String> coffees = new ArrayList<>();
        //추가
        coffees.add("ice");
        coffees.add("hot");
        coffees.add("non");
        //중복값 허용
        coffees.add("ice");
        //제거
        coffees.remove(2);
        //변경
        coffees.set(1,"latte");
        //요소하나만 가져오기
        System.out.println(coffees.get(0));


    }
}
