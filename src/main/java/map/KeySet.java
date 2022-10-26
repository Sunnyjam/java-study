package src.main.java.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeySet {
    public static void main(String[] args) {
        /*map 또한 반목문이 가능하다.
        키값을 Set으로 가져오는 keySet메소드 사용하기
         */

        Map<String,String> dictionary = new HashMap<>();

        dictionary.put("chicken","하마");
        dictionary.put("hippo","하마");
        dictionary.put("anteater","개미핥기");

        Set<String> englishWords = dictionary.keySet();

        for (String englishWord : englishWords){
            String koreanWord = dictionary.get(englishWord);
            System.out.println(englishWord+ ":"+ koreanWord);
        }
    }
}
