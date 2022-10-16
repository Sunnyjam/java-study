package src.main.java.repetitive;

public class BreakFor {
    public static void main(String[] args) {
        //왜 0시작0끝1시작1끝2시작2끝3시작으로 나오는 지 이해가 안가요.
        for( int i = 0; i<10; i=i+1){
            System.out.println("반복"+i+"시작");
            if ( i == 3){
                break;
            }
            System.out.println("반복"+i+"끝");
        }
    }
}
