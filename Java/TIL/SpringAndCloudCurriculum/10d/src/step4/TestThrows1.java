package step4;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestThrows1 {
    public void readMemo(String filename)throws FileNotFoundException{
        FileReader f = new FileReader(filename);
        System.out.println("file read..");
    }

    public static void main(String[] args){
        MemoService service = new MemoService();

        try{
            //test: 존재하지 않는 파일명으로 처리하여 예상
            // 존재하지 않는 파일명으로 처리하여 예상
            service.readMemo("C:\\java-kosta\\a.txt");
        } catch (FileNotFoundException e){
            System.out.println("파일이 없어요!!");
        }
        System.out.println("정상 수행");
    }

}
