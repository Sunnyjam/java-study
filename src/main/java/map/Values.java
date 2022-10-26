package src.main.java.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Values {
    public static void main(String[] args) {
        //values메소드를 사용하면 값 목록을 컬렉션으로 가져올 수 있다.

        Map<String,String> dictionary = new HashMap<>();

        dictionary.put("chicken","닭");
        dictionary.put("hippo","하마");
        dictionary.put("anteater","개미핥기");

        Collection<String> koreanWords = dictionary.values();

        for (String koreanWord : koreanWords){
            System.out.println(koreanWord);
        }

    }
}
