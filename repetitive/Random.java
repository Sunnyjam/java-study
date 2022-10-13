package repetitive;

public class Random {
    public static void main(String[] args) {
        /* 랜덤= Random 변수명 = new Random();
        int 새변수명 = 위에변수명.nextInt(원하는 숫자)
                                      원하는 숫자가 256이면 255까지 출력됨 */
        //random이 java.util.Random으로 입력이 되요 ㅜㅜ
        java.util.Random random = new java.util.Random();
        int randomNum = random.nextInt(256);
        System.out.println(randomNum);

    }
}
