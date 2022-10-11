package repetitive;

import java.util.Scanner;

public class WhileExam {
    public static void main(String[] args) {
        String passward ="abc123";
        Scanner scanner = new Scanner(System.in);
        System.out.println("비밀번호를 입력해주세요.");
        String input= scanner.nextLine();

        while (input.equals(passward) != true){
            System.out.println("비밀번호를 입력하세요.");
            input = scanner.nextLine();
        }
        System.out.println("올바른 비밀번호 입니다.");
    }
}
