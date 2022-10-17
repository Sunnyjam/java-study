package src.main.java.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput01 {
    public static void main(String[] args) {

        //작성한 텍스트파일을 읽어서 그 내용을 출력하는 프로그램

        FileInputStream fis = null; // 전역 변수

        try {
            fis = new FileInputStream("src/chicken.txt");
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        }

        java.util.Scanner sc = new Scanner(fis);
        String s = sc.nextLine();
        System.out.println(s);

//        FileInputStream inputStream = null;
//        try {
//            inputStream = new FileInputStream("src/chicken.txt");
//            // C:\Users\정현선\IdeaProjects\java-stu
//            System.out.println(inputStream);
//        } catch (FileNotFoundException e) {
//            System.out.println("파일이 존재하지 않습니다.");
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        String line = scanner.nextLine();
//          System.out.println(line);

    }
}
