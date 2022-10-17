package src.main.java.file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fileoutput02 {
    public static void main(String[] args) {
        /* FileWriter의 기본동작은 덮어 쓴다 따라서
           FileWriter의 데이터를 추가하기 위해서는 writer = new FileWriter("src/output01.txt",true);에서 true옵션을 줘야한다.
           true옵션을 주면 프로그램을 실행할 때마다 파일의 뒤에 썼던 내용이 추가된다.

         */
        FileWriter writer = null;
        try {
            writer = new FileWriter("src/output01.txt",true);
        } catch (IOException e) {
            System.out.println("파일 생성에 실패했습니다.");
            System.exit(1);
        }

        try {
            writer.write("치킨은 살 안 쪄요.\n");
            writer.write("살은 내가 쪄요.");
            //writer기능을 쓰면 꼭 writer.close();해주기
            writer.close();
        } catch (IOException e) {
            System.out.println("파일에 데이터를 쓰는 데 실패했습니다.");
            System.exit(2);
        }
    }
}
