package ifelse;

public class IfElse3 {
    public static void main(String[] args) {
       //if문 안에 if문 사용시 중복된 else문을 단순하게 이용하기
        int age = 15;
        if (age >=10 && age < 20){
            System.out.println("10대");
        }else {
            System.out.println("10대 아님");
        }
    }
}
