package repetitive;

public class ContinueWhile {
    public static void main(String[] args) {
        //sout를 작성하는 위치가 헷갈려요.sout다음 i=i+1을 작성하지 않으면 무한으로 실행이 되는 이유와 i=i+1을 왜 사용하는지알고 싶어요.
        int i =0;

        while( i <10){
            if(i%2==00){
                i=i+1;
                continue;
            }
            System.out.println(i);
            i=i+1;
        }
    }
}
