package src.main.java.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Entry {
    public static void main(String[] args) {
        Map<String,String> dictionary = new HashMap<>();

        dictionary.put("chicken","닭");
        dictionary.put("hippo","하마");
        dictionary.put("anteater","개미핥기");

        Set<Map.Entry<String,String>> wordPairs = dictionary.entrySet();

        for (Map.Entry<String,String> wordPair : wordPairs){
            String english = wordPair.getKey();
            String korean = wordPair.getValue();

            System.out.println(english+ ":" + korean);
        }
    }
}
