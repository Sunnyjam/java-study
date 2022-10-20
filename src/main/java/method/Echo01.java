package src.main.java.method;

import java.util.Scanner;

public class Echo01 {
    /*전역변수(자바에서는 제공x) = 멤버변수 = 프로그램이 시작될 때부터 종료될 때 까지 언제든 사용가능
      지역변수 = 메소드 내부에서 선언한 변수
     */


    //지역변수 사용
    public static void main(String[] args) {
        echoString();
        echoInteger();
    }
    //echoString-사용자로부터 문자열을 입력받아 그대로 출력하는 메소드
    public static  void echoString(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
    }
    //echoInteger- 사용자로부터 정수를 입력받아 그대로 출력하는 메소드
    public static void echoInteger(){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(input);
    }
}
