package src.main.java.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput02 {
    public static void main(String[] args) {

        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("src/electricMotor.txt");
        } catch (FileNotFoundException e) {
            System.out.println("파일이 존재하지 않습니다.");
            System.exit(10);
        }

        Scanner scanner = new Scanner(inputStream);
        String line = scanner.nextLine();
        System.out.println(line);
        /*여기서 부터 이해가 안가요.
        앞에서는 두번째줄을 출력하려면 String line2= scanner.nextLine;을 사용하고 System.out.println(line);으로 사용했는데
        여기서는 line = scannernextLine();으로 반복되요.
         */
        line = scanner.nextLine();
        System.out.println(line);
        line = scanner.nextLine();
        System.out.println(line);
    }
}
