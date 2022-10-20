package src.main.java.list;

import java.util.ArrayList;

public class ListGet {
    public static void main(String[] args) {
        // get = 특정요소 가져오기
        // students.get(요소번호,변경할 값)
        //방법은 두가지
       ArrayList<String> students = new ArrayList<String>();

       students.add("niro");
       students.add("bella");
       students.add("mike");

       //첫번째
      // System.out.println(students.get(0));

        //두번째

        String student = students.get(1);
        System.out.println("2번째 학생: "+student);

    }
}
