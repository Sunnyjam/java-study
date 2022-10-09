package study2;

public class Selfstudy1001 {
    public static void main(String[] args) {
        // 일력값 출력하기
        System.out.println( "Sunnyjam");
        System.out.println( " Going to sockcho");
        System.out.println( 1+2);
        System.out.println("'test'" + "'test2'" + "'test3'");
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
        // 대입연산 이해가 안가요,,ㅜㅜ
        int number5 = 5;
        number =6;
        System.out.println ( number);
        //서로 다른 숫자타입의 연산과 형변환 - 실수가 왜 나오는지 이해가 안가요,,ㅜㅜ
        int number6 = (int) 1.6;
        System.out.println ( number6 );
        System.out.println ( 1 + 1.2 );
        System.out.println ( 7 / 2 );
        System.out.println ( 7 / 2.0 );
        //비교 연산자
        System.out.println ( 2 < 3 );
        System.out.println ( 2 <= 3 );
        System.out.println ( 2 > 3 );
        System.out.println ( 2 >= 3);
        System.out.println ( 5 == 3 );
        System.out.println ( 5 == 5 );
        System.out.println ( 5 != 5 );
        System.out.println ( 5 != 3 );
        // y%x= 2 문제 이해가 안가요..ㅜㅜ
        int x = 5;
        int y = 2;
        System.out.println( x < y );
        System.out.println( y > x );
        System.out.println( y <= x );
        System.out.println( y * y );
        System.out.println( x * y );
        System.out.println( y % x );
        System.out.println( y % 2 );
        System.out.println( x == 5);
        System.out.println( y != 2 );
       //277개의 달걀, 30개씩 포장, 남은 달걀수 출력- 단어와 변수값 사이에는 + 기호 넣기
        int tatal = 277;
        int packing = 30;
        int eggs = 277 % 30;
        System.out.println( "총" + eggs + "개의 계란이 남습니다." );
        /* 정수형 - byte = 1byte = -128~127
                   short = 2byte = -32,768~32,767
                   int = 3byte = -2,147,483,648~2,147,483,647
                   long = 4byte = -9,223,372,036,845,775,808~9,223,372,036,845,775,807
                   정수형 변수끼리는 연산 가능
         */
        // long longResult를 int longResult로 바꾸면 오류가 뜨는데 궁금해요 ㅜㅜ
        short shortNum = 5;
        int intNum = 10;
        long longNum = 20;
        int intResult = intNum - shortNum;
        long longResult = longNum - intNum;
        System.out.println( intResult);
        System.out.println( longResult);
        /* 실수형-  float = 4byte = 숫자 뒤에 F or f 를 붙인다.
                   double = 8byte
         */
        float floatNum = 0.1f;
        double doubleNum = 0.2;
        System.out.println ( floatNum );
        System.out.println ( doubleNum );
        //실수를 표현하는 방법의 한계로 소수점아래에서 아주 정확한 값은 표현하지 못하는 예
        float floatNum1 = 0.001f + 0.001f + 0.0001f;
        System.out.println( floatNum1 );
        /*문자형- char = 2byte (char ing = 'ㅇ')
          문자열- String = (string ing = " Hello")
         */
        char character = 'ㅇ';
        System.out.println( character);
        String chicken = "치킨은 살 안 쪄요";
        String me = " 살은 내가 쪄요";
        System.out.println( chicken );
        System.out.println( me );
        //문자열 연결하기
        String hello = "님 안녕하세요";
        String i = "써니잼" + hello;
        String you = "기가써니" +  hello;
        System.out.println( i );
        System.out.println( you );
       //문자열의 글자수 세기- stringName.length();
        String characterName = " 기가서니는 써니잼";
        int length = characterName.length();
        System.out.println( "글자수" + length);
        //문자열의 일부 바꾸기
        String fat = " 치킨은 살 안 쪄요. 살은 내가 쪄요.";
        String relplace = fat.replaceAll( "내가", "네가" );
        System.out.println( relplace );
        /* 문자열 자르기- stringName.substring(시작위치,끝위치미포함)
                        stringName.substring(시작위치)
                        (String 대신해서 int를 사용하면 안되는 이유가 궁금해요..ㅜㅜ)
         */
        String birthday = "1980/01/01";
        String year = birthday.substring( 0,4 );
        String day = birthday.substring(8);
        System.out.println( "출생년도 :" + year );
        System.out.println( "출생일 : " + day );
        //논리형= boolean = true or false의 값을 가진 자료형을 논리형이라고 부른다. 논리형이해가 잘 안가요ㅜㅜ
        boolean alwaysTrue = true;
        boolean alwaysFalse = false;
        boolean is5BiggerThan3 = 5 > 3;
        System.out.println( "alwaysTrue: " + alwaysTrue);
        System.out.println( "alwaysFalse: " + alwaysFalse);
        System.out.println( "5 is bigger than 3: " + is5BiggerThan3);
        /*래퍼=wrapper 타입 (대소문자 차이점, float 외에 다른 변수 뒤에도 소문자가 필요한건 가요? -질문), 래퍼타입 이해가 안가요 ㅜㅜ
        Integer intergerNum = 3;
        Long longNum1 = 3L;
        Float floatNum2 = 3.0f;
        Double doubleNum1 = 3.0d;
        Boolean booleanValue = true;
        Integer integerNum = 3;
        float floatNum = integerNim.floatValue();
        double doubleNum = integerNim.doubleValue();
        String stringNum = integerNum.toString();*/
        //자료형을 이용해 문제풀기
        String name = "김다연";
        int age2 = 30;
        String address = " 서울시 ";
        System.out.println ( "이름 :" + name);
        System.out.println ( "나이 : " + age2);
        System.out.println ( "사는 곳 : " + address);
        int winterage = 3;
        int maxage = 7;
        boolean sameage = winterage == maxage;
        boolean winteragebigger = winterage > maxage;
        boolean maxagebigger = maxage > winterage;
        System.out.println( "윈터는 맥스와 동갑 : " + sameage);
        System.out.println( " 윈터는 맥스보다 나이가 많다 : " + winteragebigger);
        System.out.println( " 맥스는 윈터보다 나이가 많다 :" + maxagebigger);
        String date = "1970/01/23";
        String year1 = date.substring(0,4);
        String month = date.substring(5,7);
        String day1 = date.substring(8);
        System.out.println( year1+"년"+ month+"월"+ day1+"일");











    }
}

