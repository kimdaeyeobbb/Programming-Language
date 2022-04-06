package step4;

public class Calc {

    int add(int x, int y){
        // 매개변수는 간접할당. 즉, 값 복사에 의한 호출. (이와 달리 변수는 직접할당)

        //System.out.println(x+y);
        return x+y;
    }

    int sub(int x, int y){
        return x-y;
    }

    int mul(int x, int y){
        return x*y;
    }

    float div(float x, float y){
        return x/y;
    }

}
