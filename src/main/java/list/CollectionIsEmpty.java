package src.main.java.list;

import java.util.ArrayList;

public class CollectionIsEmpty {
    public static void main(String[] args) {
        //목록이 비어있는 메소드== videos.isEmpty() 사용하기

        ArrayList<String> videos = new ArrayList<>();

        if (videos.isEmpty()){
            System.out.println("목록이 비어있습니다.");
        }else {
            System.out.println("총"+videos.size()+"개의 동영상이 있습니다." +
                    "");
        }
    }
}
