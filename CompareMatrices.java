import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] firstRowCol = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[][] firstMatrix = new int[firstRowCol[0]][firstRowCol[1]];
        firstMatrix = chargeMatrix(scan, firstMatrix);

        int[] secondRowCol = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[][] secondMatrix = new int[firstRowCol[0]][firstRowCol[1]];
        secondMatrix = chargeMatrix(scan, secondMatrix);

        boolean checkqual = true;
        if (firstMatrix.length == secondMatrix.length){
            for (int i = 0; i < firstMatrix.length ; i++) {
                if (firstMatrix[i].length == secondMatrix[i].length){
                    for (int j = 0; j <firstMatrix[i].length ; j++) {
                        if (firstMatrix[i][j] != secondMatrix[i][j]){
                            checkqual = false;
                            System.out.println("not equal");
                            break;
                        }
                    }
                    if (!checkqual){
                       break;
                    }

                }else{
                    System.out.println("not equal");
                    checkqual = false;
                    break;
                }
            }
        }else {
            System.out.println("not equal");
            checkqual = false;
        }
        if (checkqual){
            System.out.println("equal");
        }
    }
    private static int[][] chargeMatrix (Scanner scan, int[][] matrix){
        for (int i = 0; i < matrix.length ; i++) {
            int[] input = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();;
            matrix[i] = input;
        }


        return matrix;
    }
}
