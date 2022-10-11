package repetitive;

public class For02 {
    public static void main(String[] args) {
     //for문은 중첩을 허용한다. Ex) 구구단을 출력시 2.3...을 하나씩 대입하지 않고 중첩for문을 이용하여 간단히 작성할 수 있다.
     for (int i =2; i <10; i=i+1){
         for( int j = 1; j <10; j= j+1){
             int result = i * j;
             System.out.println( i+"X"+j+"="+result);
         }
     }
        }
    }

