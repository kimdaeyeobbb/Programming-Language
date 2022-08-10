package step5;

public class NameException extends Exception{
    // throw : 특정위치에 에러가 나올거 깥으면 vm에게 에러나올것 같으니 자동으로 처리하라고 함
    NameException(String message){
        super(message);
    }
}
