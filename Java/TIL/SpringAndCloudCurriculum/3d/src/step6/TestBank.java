package step6;

import bank.hana.Hanabank;
import bank.kb.KbBank;
// 자바는 필수 패키지로 구성되어있다 + 이러한 패키지를 가져올 일이 많다.

public class TestBank {
    public static void main(String[] args){
        KbBank kb = new KbBank();
        kb.deposit(500);

        Hanabank hana = new Hanabank();
        int result = hana.withdraw();
        System.out.println(result);
    }
}
