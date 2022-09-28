// 구구단 2단 출력 성공하면, 2단부터 9단까지
public class TimeTable {
     public static void main(String[] args){
         // 방법 1
         for ( int i = 2; i <19; i++ ) {
            System.out.println( i++ );
         }

         // 방법 2 , 과제 1
         for (int i = 2; i <= 9; i++) {
             System.out.println();
         }
     }
    }
