package ifelse;

public class IfElse2 {
    public static void main(String[] args) {
        //두 조건을 동시에 만족할 때 실행하기=if는 중첩문 허용=if문 안에 if문 삽입 가능
        //연령대가 20대인지 아닌지 출력하기
      int age = 29;
      if ( age >= 20){
          if (age < 30){
              System.out.println("20대");
          }else {
              System.out.println("20대 아님");
          }
          }else {
          System.out.println("20대 아님");
      }
      }
    }
