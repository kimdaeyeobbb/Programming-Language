package step2;

public class Array3 {
    public static void main(String[] args){
        int[] arr = new int[100];
        // 정수형 공간 100개 생성
        // 배열은 똑같은 타입만 받을 수 있다

        /* 데이터 삽입 */
        for (int i=0; i<arr.length; i++){
            arr[i] = i;
        }

        System.out.println("arr 배열의 크기 : " + arr.length);

        /* 출력을 통해 데이터 확인 */
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
