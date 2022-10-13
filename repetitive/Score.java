package repetitive;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
     String[] subjects = {"국어","영어","수학","과학"};
     int[] scores = {90,75,30,40};

     Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 알고 싶은 과목명을 입력하세요.");

        String inputSubject = scanner.nextLine();

        //for부터 이해가 안가요..
        for(int i = 0; i<subjects.length; i=i+1){
            String subject = subjects[i];

            if(subject.equals(inputSubject)){
                System.out.println(inputSubject+"점수는"+scores[i]+"점입니다.");
            }
        }
    }
}
