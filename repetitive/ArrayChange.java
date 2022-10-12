package repetitive;

public class ArrayChange {
    public static void main(String[] args) {
       /*배열의 특정 요소 바꾸기
       변수명[인덱스숫자]= " ";
        */
        String[] days= {"월","화","수","목","금","토","일"};
        days[0]="일";

        for (int i=0; i< days.length; i=i+1){
            System.out.println(days[i]+"요일");
        }
    }

}
