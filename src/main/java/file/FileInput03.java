package src.main.java.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput03 {
    public static void main(String[] args) {
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream("src/electricMotor.txt");
        }catch (FileNotFoundException e){
            System.out.println("파일이 존재하지 않습니다.");
            System.exit(10);
        }

        //new Scanner()괄호 안에 System.in이 아닌 inputstream이 들어가는 게 잘 이해가 안가요.
        Scanner scanner = new Scanner(inputStream);

        //Scanner의 hasNextLine()은 입력소스에 다음 줄이 존재한다면 true를 되돌려주는 기능
        /*hasNext가 String pattern이랑 pattern pattern이 있는데 둘다 실행이 되는데 차이점이 궁금해요.
        String.matches의 내부에는 이미 Pattern.matcher로 구성되어 있기 때문에 차이점이 없다라고 나와요.
         */

        while (scanner.hasNext()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }
}
