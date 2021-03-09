package MultiDimensionalArray;

/**
 * Created by kedar on 3/5/2021.
 */
public class ArrayInput {

    //int [] arr = {1,2,3};
    // int [] arr = new int [array_size];

    //Addition of 2 * 2 Matrix
    public void getArray() {
        int[][] arr = {{1, 2, 3}, {4, 5, 5}, {1, 2, 3}};
        int[][] b = {{7, 8, 6}, {10, 11, 12}, {1, 2, 3}};

        int[][] total = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < b.length; j++) {

                total[i][j] = arr[i][j] + b[i][j];
                System.out.print(total[i][j] + " ");
            }
            System.out.println();
        }
    }
}
