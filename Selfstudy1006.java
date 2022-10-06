import java.util.Scanner;

public class Selfstudy1006 {
    public static void main(String[] args) {
        //키보드로부터 한 줄 입력 받기 (30% 이해가 안가요..ㅜㅜ)여기부분부터는 잘 이해가 안가요..ㅜㅜ
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
        System.out.println( "이름을 입력하세요.");
        Scanner scanner2 = new Scanner(System.in);
        String name = scanner2.nextLine();
        System.out.println( name + "님,반갑습니다.");
        //키보드로부터 띄어쓰기 단위로 입력받기
        System.out.println( "영어단어와 한글단어를 하나씩 입력해보세요.");
        Scanner scanner3 = new Scanner(System.in);
        String englishWord = scanner3.next();
        String koreanWord = scanner3.next();

        System.out.println( "입력된 영어단어:" + englishWord);
        System.out.println( "입력된 한글단어:" + koreanWord);
    }
}