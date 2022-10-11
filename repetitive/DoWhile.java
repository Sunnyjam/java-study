package repetitive;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        /*do-while=while문과 동일하게 특정조건을 만족하는 경우 계속해서 블록안의 코드를 실행하는 반복문
        do{실행할 코드} while(조건);
         */
        /*실행되는 순서가 다는 이해가 안가요, String=passward랑 String input를 작성하는 순서도 중요한가요?
        마지막에 올바른 비밀번호를 입력했습니다는 블록안에 코드가 다 실행되면 나오는 코드를 의미하는 건가요?
         */
        String passward = "abc123";
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("비밀번호를 입력하세요.");
            input= scanner.nextLine();
        }while(input.equals(passward) != true);
        System.out.println("올바른 비밀번호를 입력했습니다.");
    }
}
