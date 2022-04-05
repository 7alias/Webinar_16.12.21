import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int [][]matrix = new int [][]{{1,2,3},{4,5,6,7}};

        System.out.println(Arrays.deepToString(matrix));


        for (int []arr: matrix) {

for(int val: arr){
    System.out.println(val);
}
//            System.out.println(Arrays.toString(arr));


        }


    }
}
