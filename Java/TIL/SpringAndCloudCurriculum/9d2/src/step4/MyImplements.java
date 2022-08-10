package step4;

public class MyImplements implements MyInterface1,MyInterface2 {
    // 인터페이스 2개 제작 -> 2개 모두 상속받겠다는것을 추측가능
    // 인터페이스 - 기능은 있으나, 속(내용)은 비어있다. -> 내용은 사용자가 채워넣어야 함


    /* 다중상속 - 인터페이스는 다중상속이 가능 (구현된 부분이 없기 때문)*/
    @Override
    public int add() {
        int i,sum=0;
        for(i=0; i<SIZE; i++){
            sum += i;
        }
        return sum;
    }

    @Override
    public void mul() {
        int i,result=1;
        for(i=2; i<MAX; i++){
            result*=i;

        }
        System.out.println("Mul()의 구현 결과= "+result);
    }
}
