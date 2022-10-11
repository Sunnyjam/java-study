package repetitive;

public class While {
    public static void main(String[] args) {
        /*For문은 특정횟수나 특정요소들의 개수만큰 반복하는 방법,boolean값으로 표현, 중첩가능
        for(초기값; 종료조건값; 증가){실행할 코드}
        While문은 특정조건을 만족할 때까지 반복하는 방법,종료조건을 잘 다뤄야함, boolean값으로 표현
        while(조건){실행할 코드}
        boolean값표현= 값이 true이면 ()코드를 실행한다.
         */
        int i = 0;
        while ( i <10){
            System.out.println("현재 반복 횟수:"+ i);
            i=i+1;
            //for문에서랑 같이 왜 0부터 출력되는 지 궁금해요.
        }
    }
}
