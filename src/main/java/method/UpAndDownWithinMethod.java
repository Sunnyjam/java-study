package src.main.java.method;

import java.util.Random;
import java.util.Scanner;

public class UpAndDownWithinMethod {

    public static int randomNumber;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //랜덤넘버 초기화
        Random random = new Random();
        randomNumber = random.nextInt(256);

        int attempt = 0;

        while (attempt < 8){
           boolean isCorrect =  play();

           if (isCorrect){
               break;
           }

           attempt = attempt +1;
            System.out.println(attempt+"회 시도하였습니다.");
        }
        System.out.println("게임을 종료합니다.");
    }
    public static boolean play(){
        System.out.println("숫자를 입력하세요.");
        int input = scanner.nextInt();

        if(input == randomNumber){
            System.out.println("짝짝짝.정답합니다.");
            return true;
        }//else if,else에서 return false;를 반복해서 쓰지 않고 마지막으로 뺴기
        else if (input> randomNumber) {
            System.out.println("더 작게요.");
        }else {
            System.out.println("더 크게요.");
        }
        return false;
    }
}
