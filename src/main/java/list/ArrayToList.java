package src.main.java.list;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        //배열을 List로 변환하기
        //Arrays가 제공하는 asList메소드를 이용하기

        //List는 원시타입을 사용할 수 없기 때문에 래퍼타입으로 선언한다.

        Integer[] integerArray = {1,2,3,4,5,6,7,8,9};
        List<Integer> integerList = Arrays.asList(integerArray);
        System.out.println(integerList);
    }
}
