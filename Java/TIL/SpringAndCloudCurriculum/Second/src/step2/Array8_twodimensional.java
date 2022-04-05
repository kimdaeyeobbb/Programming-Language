package step2;

public class Array8_twodimensional {
    public static void main(String[] args){
        int[][] bidimensionalArray = {{1,2,3},{4,5,6}};
        int[][] arr2 = new int[3][3];

        for (int i=0; i<bidimensionalArray.length;  i++){
            for (int j=0; j<bidimensionalArray[i].length; j++){
                System.out.printf(bidimensionalArray[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
