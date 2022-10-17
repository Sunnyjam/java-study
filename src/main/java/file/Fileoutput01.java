package src.main.java.file;

import java.io.FileWriter;
import java.io.IOException;

public class Fileoutput01 {
    public static void main(String[] args) {
        /*문자열을 파일로 저장하는 방법= FileWriter,writer.close();, try-catch(IOException e)=에러를 출력해주는 것
        작성한 텍스트파일을 읽어서 내용 출력하는 방법= FileInputStream, try-catch(FileNotFoundException e)
         */

        try {
            FileWriter writer = new FileWriter("src/output01.txt");
            writer.close();
        }catch (IOException e){
            System.out.println("파일 생성에 실패했습니다.");
            /*System.exit(0);은 정상적인 종료일 경우
            System.exit(1);은 에러가 발생했을 경우라고 나오는데
            System.exit(10);이랑 System.exit(11);은 무엇인지 안 나와요.
             */
            System.exit(11);
        }

    }
}
