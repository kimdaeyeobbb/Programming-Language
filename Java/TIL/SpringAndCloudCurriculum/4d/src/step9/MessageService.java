package step9;

public class MessageService {

    /*
    * Service - 기능만 구현. 따라서 기능 구현을 위해 생성자를 만들필요가 없고
    * 메서드가 매개변수만 있으면 된다.
    * */
    public void printLoop(String str, int i){
        for(int a=1; a<=1; a++) {
            System.out.println(str+a);
        }
    }

    public void printOddEven(int i, int j){
        for (int a=1; a<=j; a++){
            if(a%2 == 0){
                System.out.println(a+"짝수");
            } else{
                System.out.println(a+"홀수");
            }
        }
    }


}
