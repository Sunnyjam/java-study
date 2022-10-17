package src.main.java.file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fileoutput03 {
    public static void main(String[] args) {

        FileWriter writer = null;
        try {
            writer = new FileWriter("src/output02.txt", true);
        } catch (IOException e) {
            System.out.println("파일을 생성하는 데 실패했습니다.");
            System.exit(1);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("종료하려면 입력 없이 엔터.");
        /*반복적으로 입력을 받다가 원하는 시점에 종료하고 싶은 프로그램
        while문을 이용해 무한반복시키기,try-catch는 while문 안에 들어와야 하기 때문에 대괄호 마지막 위치 확인하기
        if문을 사용해 빈칸일 경우 종료
        try의 안에 writer.write();에서 writer.close;를 사용하려면
        항상 파일을 다 사용하고난 뒤에 해줘야하기 떄문에 while문의 끝에서 해주는 것이 아니라
        while문을 탈출한 이후에 해줘야한다!!
        */
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")){
                System.out.println("파일 입력을 종료합니다.");
                break;
            }

            try {
                writer.write(input);

            } catch (IOException e) {
                System.out.println("파일에 데이터를 쓰는 데 실패했습니다.");
                System.exit(2);
            }
        }
        try {
            writer.close();
        } catch (IOException e) {
            System.out.println("파일 닫기에 실패했습니다.");
        }
    }
}
