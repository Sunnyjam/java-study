package repetitive;

public class Break {
    public static void main(String[] args) {
        /*try문안에 if, while문 안에 if가 나왔었는데 중첩이 가능한 문법은 같은 문법이 아니더라도 이중으로 사용이 가능한건가요?
        if가 이중으로 사용되는 문법이 따로 있면 암기가 필요한가요?
         */
        //완성된 값이 반복문 진입,반복문 끝이 나오는 것까지는 이해가 되는데 왜 진입,끝,진입,끝,진입으로 끝나는 지 이해가 안가요.
        /*반복문의 조건을 true로주어 무한히 반복되는 코드를 만다고 나와있는데 반복되는 코드를 만드는 것이 정해진 문법인가요?
        아니면 책에서 예제로 나와있는 건가요?
         */

        int i=0;
        while (true){
            System.out.println("반복문 진입");
            if(i==2){
                break;
            }
            i=i+1;
            System.out.println("반복문 끝");
        }
    }
}
