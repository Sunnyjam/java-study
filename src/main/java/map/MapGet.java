package src.main.java.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapGet {
    public static void main(String[] args) {
        //get메소드 사용하여 값 출력하기

        Map<String,String> dictionary = new HashMap<>();

        dictionary.put("chicken","닭");
        dictionary.put("hippo","하마");
        dictionary.put("anteater","개미핥기");

        Scanner scanner = new Scanner(System.in);
        String english = scanner.nextLine();
        String korean = scanner.nextLine();

        if (korean == null){
            System.out.println("사전에 존재하지 않는 단어입니다.");
        }else {
            System.out.println(english+"는"+korean+"입니다.");
        }
    }
}
