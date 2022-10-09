package study2;

import java.util.Scanner;

public class ScannerDouble {
    public static void main(String[] args) {
       Scanner external = new Scanner(System.in);
        System.out.println("달러의 환율을 입력하세요.");
        String exchageprice = external.nextLine();
        System.out.println("어그부츠의 가격을 입력하세요.");
        String uggprice = external.nextLine();
        double exchage = Double.parseDouble(exchageprice);
        double ugg = Double.parseDouble(uggprice);
        System.out.println("어그부츠의 가격은 "+ ugg/exchage+"달러 입니다.");
    }
}
