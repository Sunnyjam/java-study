package src.main.java.repetitive;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int sum = 0;

        //for부터 이해가 안가요.
        for (int i: arr){
            sum = sum+i;
        }
        System.out.println("배열의 총 합은 "+sum+"이다.");
    }
}
