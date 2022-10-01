public class Selfstudy1001 {
    public static void main(String[] args) {
        // 일력값 출력하기
        System.out.println( "Sunnyjam");
        System.out.println( " Going to sockcho");
        System.out.println( 1+2);
        // "" 사용하기 실패 ㅜㅜ

        //줄바꿈
        System.out.println( " Today is \n going to gangwon");
        //변수
        int number = 1;
        System.out.println( number);
        int number1 = 3;
        int number2 = number1;
        System.out.println( number2);
        // 변수 사용하기
        System.out.println( 100 * 0.15);
        System.out.println( 300 * 0.15);
        System.out.println( 1000 * 0.15);
        // (변수의 필요성) 비율이 바뀌게 되면 다 고치지 않고 변수값만 바꿔 일을 빠르게 처리할수 있다.
        int ratio = 13;
        System.out.println( 100 * ratio / 100.0);
        System.out.println( 300 * ratio / 100.0);
        System.out.println( 1000 * ratio /100.0);
        // 변수 사용에서 Good example & Bad example
        int a = 26;
        int b = a + 10;
        System.out.println( b );
        int age = 26;
        int ageAfter10Years = age + 10;
        System.out.println( ageAfter10Years );
        int age1 = 26;
        int age1After10Years = age1 + 10;
        int age1After20Years = age1 + 20;
        int age1After30Years  = age1 + 30;
        System.out.println( age1After10Years );
        System.out.println( age1After20Years );
        System.out.println( age1After30Years );

        //(JABA) reserved words 66page 읽고 눈에 익히기(10월3일까지)

        //산술연산
        System.out.println( 1 + 2);
        System.out.println( 4 - 2 );
        System.out.println( 2 * 2 );
        System.out.println( 4 / 2 );
        System.out.println( 7 % 2 );
        //산슬연산의 우선순위
        // 1. () 괄호 안의 연산
        // 2. *, /, %
        // 3. +, -
        System.out.println( 2 * 2 + 1);
        System.out.println( (10-2) / 2);
        // 서로 다른 숫자타임의 연산과 형 변환 - 이해가 안가요ㅜㅜ
        int number4 = (int) 1.6;
        System.out.println( number4 );
        System.out.println( 1+ 1.2 );
        System.out.println( 7 / 2 );
        System.out.println( 7 / 2.0 );





    }
}

