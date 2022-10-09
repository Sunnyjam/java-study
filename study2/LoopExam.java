package study2;

public class LoopExam {
    public static void main(String[] args) {

        // study2.Exam 1. 10부터 1까지 감소하는 반복문
        for ( int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // study2.Exam 2. 10부터 1까지 감소하는 반복문
        int i = 10;
        while (i >0) {
            System.out.println(i--);
        }

        // study2.Exam 3. y 와 x 라는 변수를 생성 후, 숫자 20인 합을 출력하세요
        int y = 12;
        int x = 8;

        System.out.println( y + x);

    }
}
