package src.main.java.repetitive;

public class ContinueFor {
    public static void main(String[] args) {
        /* break=반복문 탈출 조건
        continue= 코드를 더 이상 진행시키지 않고 바로 반복문의 처음으로 되돌아가 다음 반복문을
        실행시키도록 한다.
         */
        //짝수가 아닌경우는 2를 사용하였는데 i%1을 했을 때는 아무것도 출력이 안되는 데 이유가 궁금해요.
        for (int i=0; i < 10; i=i+1){
            if(i % 2 == 00){
                continue;
            }
            System.out.println(i);
        }
    }
}
