package step10;

public class ArrParamMain {
    public static void main(String[] args){

        ArrParam ap = new ArrParam();   // 객체 생성
        int[] arr1 = {1,2,3,4,5};

        ap.makeMax(arr1);
        ap.makeSum(arr1);
        ap.makeAvg(arr1);


    }
}
