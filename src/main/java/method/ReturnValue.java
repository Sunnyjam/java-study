package src.main.java.method;

public class ReturnValue {
    /*반환값 = 메소드의 활용도를 높이는 기능= 값을 되돌려주는 기능
      반환값이란? 메소드의 코드 실행이 끝날 때 호출한 위치에서 사용 가능한 값을 되돌려주는 것.
     */

    public static void main(String[] args) {
        int result = sum(2, 4);
        System.out.println(result);
    }

    public static int sum(int a, int b) {
        //메소드에 반환=return
        return a + b;
    }
}
