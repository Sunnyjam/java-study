package src.main.java.list;

import java.util.ArrayList;

public class List01 {
    //collection = 데이터 목록들의 관리를 편하게 만들어주는 도구
    /*collection의 일종인 List
    - List<Type> list = new ArrayList<Type>();
    *문자열 타입의 List를 선언하는 방법*
    -List<String> list = new ArrayList<String>();
    -List<String> list = new ArrayList<>();
    -ArrayList<String> list = new ArrayList<>();
     */

    public static void main(String[] args) {
       //List는 int와 같은 원시형 자료를 허용하지 않기 때문에 래퍼타입(Integer)을 사용해야한다.
        java.util.List<Integer> list1 = new ArrayList<>();
        java.util.List<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<>();
    }
}
