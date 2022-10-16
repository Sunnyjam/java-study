package src.main.java.ifelse;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        System.out.println("총 달걀의 수를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int eggsCartonSize = 30;
        int totalEggs= 0;
        String input = scanner.nextLine();

        try{
            totalEggs = Integer.parseInt(input);
            if ( totalEggs < 30) {
                System.out.println("계란판이 필요하지 않습니다.");
            }else {
                int totalEggCartons = totalEggs/eggsCartonSize;
                System.out.println("총 "+ totalEggCartons+"개의 계란판이 필요합니다.");
            }
        }catch (Exception e){
            System.out.println("잘못된 입력값 입니다.");
        }
    }
}
