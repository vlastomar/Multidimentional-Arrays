import java.util.Arrays;
import java.util.Scanner;

public class IntersectionTwoMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int row = Integer.parseInt(scan.nextLine());
        int col = Integer.parseInt(scan.nextLine());
        char[][] first = new char[row][col];
        char[][] second = new char[row][col];
        char[][] third = new char[row][col];
        first = chargeMatrix(scan, first);
        second = chargeMatrix(scan, second);

        for (int i = 0; i < first.length ; i++) {
            for (int j = 0; j <first[i].length ; j++) {
                if (first[i][j] == second[i][j]){
                    third[i][j] = first[i][j];
                    System.out.print(String.format("%c ", third[i][j]));
                }else {
                    third[i][j] = '*';
                    System.out.print(String.format("%c ", third[i][j]));
                }
            }
            System.out.println();

        }

    }
    private static char[][] chargeMatrix(Scanner scan, char[][] matrix){
        for (int i = 0; i < matrix.length ; i++) {
            String[] inputSS = scan.nextLine().split("\\s+");
            char[] input = new char[inputSS.length];
            for (int j = 0; j <inputSS.length ; j++) {
                input[j] = inputSS[j].charAt(0);
            }


            matrix[i] = input;
        }

        return matrix;
    }
}
