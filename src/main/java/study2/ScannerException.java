package src.main.java.study2;

import java.util.Scanner;

public class ScannerException {
    public static void main(String[] args) {
        //scanner 선택 시 string을 사용할거면 string의 scanner 선택하기 아님 오류가 뜸.
        Scanner ex = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        String numberinput = ex.nextLine();
        try {
            int number11 = Integer.parseInt(numberinput);
            number11 = number11+1;
            System.out.println(" 다음 숫자는 "+number11+"입니다.");
        }//catch뒤에는 {}사욯하기
        catch (Exception e){
            System.out.println("순순히 숫자를 입력한다면");
            System.out.println("유혈사태는 일어나지 않을 것 입니다.");
            System.out.println(" 입력값= "+ numberinput);
        }

//        try {
//            // 실행될 코드
//        } catch (Exception e) {
//
//        }

    }
}
