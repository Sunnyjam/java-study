package src.main.java.method;

import java.util.Scanner;

public class MethodCallWithinMethod {
    /*메소드 안에서 다른 메소드를 호출하는 것도 가능하다.
    !반드시 숙지 필요!
    방법- 1.메소드는 다른 메소드를 호출할 수 있다.
         2.메소드는 자기 자신 또한 호출할 수 있다.= 재귀함수 =recursion
                                            =재귀함수는 같은 메소드를 무한히 반복해 호출하다가 프로그램이 죽어버릴 위험이 있다.

     */

    public static void main(String[] args) {
      caculate();
    }

    public static void caculate(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("원하는 연산을 선택하세요.");
        System.out.println("1: 덧셈");
        System.out.println("2: 곱셈");
        System.out.println("그 외: 종료");

        String input = scanner.nextLine();
        System.out.println("첫 번째 숫자를 입력하세요.");
        int a = scanner.nextInt();

        System.out.println("두 번째 숫자를 입력하세요.");
        int b = scanner.nextInt();

        //1.덧셈으로 해놨는데 왜 input.equals("1")으로 사용하는 지 이해가 안가요.
        if (input.equals("1")){
           /*책에서는 int add = a + b;없이 int sum = add(a,b);으로만 썼는데 오류가 나요.
           1.int add = a+b라고 적고 실행하기
           2.맨 아래 다른 메소드를 적고 실행하기(책에서 나오내용)
           어떤 방법으로 해도 상관 없나요?
            */
            int sum = add(a,b);
            System.out.println(a+"+"+b+"="+sum);

        }
        if (input.equals("2")){
            int product = multiply(a,b);
            System.out.println(a+"*"+b+"="+product);
        }
    }
    public static int add(int a,int b){
        System.out.println("덧셈을 수행합니다.");
        return a+b;
    }
    public static int multiply(int a, int b){
        System.out.println("곱셈을 수행합니다.");
        return a * b;
    }

}
