package ifelse;

public class IfElse1 {
    public static void main(String[] args) {
        int number = 1;
        String str = "hello";
        
        // 1일 number 출력, hello 일 경우 str 출력
        if (number == 1) {
            System.out.println(number);
        } else {
            System.out.println("1이 아닙니다.");
        }
        
        // equals : 값 자체를 비교
        if (str.equals("hello")) {
            System.out.println(str);
        } else {
            System.out.println("hello가 아닙니다.");
        }

        
    }
}
