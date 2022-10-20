package src.main.java.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        students.add("장민호");
        students.add("이찬원");
        students.add("정동원");
        students.add("임영웅");

        /* sort-오름차순
           reverse- 내림차순
           shuffle- 랜덤
         */
        Collections.sort(students);
        Collections.reverse(students);
        Collections.shuffle(students);

        System.out.println(students);
    }
}
