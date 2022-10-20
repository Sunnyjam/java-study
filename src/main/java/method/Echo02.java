package src.main.java.method;

import java.util.Scanner;

public class Echo02 {
    //지역변수 사용
   // 여기부분을 동영상은 없고 책에만 나와있는데 프로그램은 이해가가 되지만 작성하는 순서와 실행이 정수만 되고 문자열이 안되는 이유가 궁금해요.
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        echoSomeinputs();
    }
    public static void echoSomeinputs(){
        echoInteger();
        echoString();
    }

    public static void echoInteger(){
        int input = scanner.nextInt();
        System.out.println(input);
    }
    public static void  echoString(){
        String input = scanner.nextLine();
        System.out.println(input);
    }
}
