import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsSquareMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int[][] matrix = new int[number][number];
        for (int i = 0; i < number; i++) {
            int[] input = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = input;
        }
        String firstDiag = "";
        String secondDiag = "";
        for (int i = 0; i < matrix.length ; i++) {
            firstDiag += matrix[i][i] + " ";
            secondDiag += matrix[matrix.length - 1 - i][i] + " ";
        }
        System.out.println(firstDiag);
        System.out.println(secondDiag);

    }
}
