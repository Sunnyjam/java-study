package src.main.java.repetitive;

import java.util.Scanner;

public class WhileBreak {
    public static void main(String[] args) {
        String passward = "abc123";
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("비밀번호를 입력하세요");
            String input = scanner.nextLine();

            if ( input.equals(passward)){
                System.out.println("비밀번호가 일치합니다");
                break;
            }
            System.out.println("비밀번호가 틀렸습니다.");
        }
    }
}
