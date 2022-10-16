package src.main.java.study2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) {

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
