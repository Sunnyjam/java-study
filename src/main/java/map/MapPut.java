package src.main.java.map;

import java.util.HashMap;
import java.util.Map;

public class MapPut {
    public static void main(String[] args) {
        /*map이란? 키-값 쌍으로 이루어져 있는 자료구죠
        Map은 순서를 따지지 않기 때문에 List처럼 특정 위치의 데이터를 가져다 사용할 수 없다.
        대신 키를 알고 있다면 그 키를 통해 값을 가져오는 방법을 사용할 수 있다.
        Map<KeyType,Value Type> map = new HasMap<>();
        List - ArrayList
        Set - HashSet
        Map - HashMap
         */

        //Map에 데이터 추가하기 == map.put(키,값)
        Map<String,String> map = new HashMap<>();

        map.put("chicken","닭");
        map.put("hippo","하마");

        System.out.println(map);
    }
}
