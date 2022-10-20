package src.main.java.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContainsExample {
    public static void main(String[] args) {
        System.out.println("저장할 음식의 이름을 입력.(종료: 0)");
        List<String> foods = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            String food = scanner.nextLine();

            if (food.equals("0")){
                break;
            }
            if (foods.contains(food)){
                System.out.println("이미 목록에 있습니다");
            } else  {
                foods.add(food);
            }
        }
        System.out.println(foods);
    }
}
