package src.main.java.method;

public class Parameter {
    /*매개변수 = 메소드의 입력 값을 정의한 부분, 메소드는 매개변수로 여러 개의 값을 받을 수 있다.
     매개변수란? 메소드를 호출할 때 함께 입력할 수 있는 데이터
     */

    public static void main(String[] args) {
        printsum(3,5);
    }

    public static void printsum(int a, int b){
       //System.out.println(a+"+"+b+"="+ sum(a,b));
        System.out.println(a+"+"+b+"="+(a+b));
    }

    }

