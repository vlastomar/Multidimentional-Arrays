import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] rowCol = Arrays.stream(scan.nextLine().split("\\s*,\\s*")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[rowCol[0]][rowCol[1]];
        System.out.println(rowCol[0]);
        System.out.println(rowCol[1]);
        for (int i = 0; i <matrix.length ; i++) {
            int[] input = Arrays.stream(scan.nextLine().split("\\s*,\\s*")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = input;
        }
        int sum = 0;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
