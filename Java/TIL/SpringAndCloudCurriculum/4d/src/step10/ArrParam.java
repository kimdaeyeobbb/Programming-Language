package step10;

public class ArrParam {
    private int max;
    private int sum;
    private float avg;

    // 메서드 하나 만든 후 내부에서 기능구현할 것것
   public void makeMax(int[] arr){

        int i;
        max = arr[0];
        for (i=1; i<arr.length; i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
    }

    public void makeSum(int[] arr){
       int i;
       sum = 0;
       for (i=0; i<arr.length; i++){
           sum += arr[i];
       }
    }

    void makeAvg(int[] arr){
       makeSum(arr);
       avg = (float)sum/arr.length;


    }
}
