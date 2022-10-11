package ifelse;

public class Exam2 {
    public static void main(String[] args) {
        double height = 1.6;
        double weight = 50.0;
        double bmi= weight / (height*height);

        if ( bmi < 18.5){
            System.out.println("저체중 입니다.");
        }else if (bmi >= 20){
            System.out.println("과체중 입니다.");
        }else {
            System.out.println("정상체중 입니다.");
        }
    }
}
