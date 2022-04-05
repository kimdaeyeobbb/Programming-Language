package step2;

public class Array2 {
    public static void main(String[] args){
        int[] month = {31,29,31,31,31,31,31,31,31,31,31,31};

        for (int i=0; i<month.length; i++){
            System.out.println((i+1)+"월 : "+month[i]+"일");
        }
    }
}
