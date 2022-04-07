package step5;

public class Person {
    public void study(String subject){
        System.out.println(subject + "을(를) 공부하다");
    }

    public void wake(int time){
        System.out.println(time + "시 기상");
    }

    public void eat(String food, int count){
        System.out.println(food +" "+count+ "인분을 먹다");
    }

    public void plus(int i, int j){
        System.out.println(i+j);
    }

    public String play(){

        return "게임방에서 놀다";
    }

    public String order(int money){
        System.out.println(money+"원 입금");
        return "설렁탕";
    }

    public int minus(int i, int j){
        return i-j;
    }
}
