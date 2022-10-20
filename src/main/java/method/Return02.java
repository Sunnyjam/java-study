package src.main.java.method;

import java.util.Scanner;

public class Return02 {
    /*return의 용도 = 1. 모두 반환값을 넘기는 용도로 사용
                    2. 반환값 없이 함수로 탈출하는 것.!반환값이 없어야 사용할 수 있다.반환값이 있다면 꼭 그 반환할 수 있도록 해야한다.
                     (이것은 반환값의 타입이 void로 지정되었을 때에만 사용할 수 있다.)
     */

    public static void main(String[] args) {
        System.out.println("이름을 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        sayHola(name);
    }

    public static void sayHola(String name){
        if (name.equals("바보")){
            System.out.println("바르고 고운 말을 사용해주세요.");
            return;
        }
        System.out.println(name+"님, 안녕하세요?");
        }
    }

