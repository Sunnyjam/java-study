package src.main.java.map;

import java.util.HashMap;
import java.util.Map;

public class MapRemove {
    public static void main(String[] args) {
        //Map에서 데이터 제거

        Map<String,String> dictionary = new HashMap<>();

        dictionary.put("chicken","닭");
        dictionary.put("hippo","하마");
        dictionary.put("anteater","개미핥기");

        dictionary.remove("hippo");
        System.out.println(dictionary);
    }
}
