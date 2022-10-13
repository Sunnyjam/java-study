package repetitive;

public class ThreadSleep {
    public static void main(String[] args) {
        /*지연시간 추가= Thread.sleep(1000);
                                  1/1000초=1초
         */

        System.out.println("지금 무슨 생각을 하고 있는 지 맞춰볼게요.");
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println("Thead.sleep 실패.");
        }
        System.out.println("치킨!" );
    }
}
