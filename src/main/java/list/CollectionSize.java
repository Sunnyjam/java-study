package src.main.java.list;

import java.util.ArrayList;

public class CollectionSize {
    public static void main(String[] args) {
        /*컬렉션이 비어있는 지 확인 하는 대표적인 방벙 두가지
        1.컬력션의 크기를 사용하는 방법
        2.미리 준비된 메소드를 이용하는 방법
        ==videos.size()
         */
        ArrayList<String> videos = new ArrayList<>();

        videos.add("뽀로로 노래");
        videos.add("블랙핑크");
        videos.add("bts");

        System.out.println("총"+videos.size()+"개의 동영상이 있습니다.");
    }
}
