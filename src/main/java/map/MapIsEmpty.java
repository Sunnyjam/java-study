package src.main.java.map;

import java.util.HashMap;
import java.util.Map;

public class MapIsEmpty {
    public static void main(String[] args) {
        //isEmpty메소드 사용하기- boolean

        Map<String,String> contact = new HashMap<>();

        if (contact.isEmpty()){
            System.out.println("연락처가 비어있습니다.");
        }
    }
}
