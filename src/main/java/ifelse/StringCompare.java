package src.main.java.ifelse;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        //문자열 비교하기 위해선 .equals()사용
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String chicken = "치킨";
        System.out.println(input.equals(chicken));
    }
}
