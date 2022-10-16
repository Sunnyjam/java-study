package src.main.java.study2;

import java.util.Scanner;

public class ScannerInteger {
    public static void main(String[] args){
        System.out.println("현재 년도를 입력하세요.");
        Scanner subtraction = new Scanner(System.in);
        String nine = subtraction.nextLine();
        int number9 = Integer.parseInt(nine);
        number9 = number9-9;
        System.out.println("2022년의 9년 전은 "+number9+"년 입니다.");

    }
}
