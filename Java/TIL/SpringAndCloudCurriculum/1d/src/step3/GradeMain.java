package step3;

public class GradeMain {
    public static void main(String[] args){
        Grade g = new Grade();
        // 객체 생성
        // new가 나왔을 경우 힙에 위치함

        float tot;

        /* 값 할당 */
        g.name = "홍길동";
        g.kor = 100;
        g.eng = 90;
        g.math = 80;

        tot = g.total = g.kor+g.eng+g.math;
        g.avg = tot/3;

        System.out.println("이름: "+g.name);
        System.out.println("국어점수: "+g.kor);
        System.out.println("영어점수: "+g.eng);
        System.out.println("수학점수: "+g.math);

        System.out.println("총점: "+tot);
        System.out.println("평균: "+g.avg);
    }
}