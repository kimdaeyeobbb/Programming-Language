package step2;

public class Array {
    public static void main(String[] args){
        int[] month;   // 배열 선언 (배열은 '방'이다)
        month = new int[12];   // 배열의 크기 지정 (12개)
        month[0] = 31;   // 배열의 요소에 데이터 삽입
        month[1] = 28;
        month[2] = 31;
        month[3] = 31;
        month[4] = 31;
        month[5] = 31;
        month[6] = 31;
        month[7] = 31;
        month[8] = 31;
        month[9] = 31;
        month[10] = 31;
        month[11] = 31;

        for (int i=0; i<month.length; i++){
            System.out.println((i+1)+"월 : "+month[i]+"일");
        }

    }
}
