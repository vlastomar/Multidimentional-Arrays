import java.util.Arrays;
import java.util.Scanner;

public class PositionOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] dimensios = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[dimensios[0]][dimensios[1]];
        for (int i = 0; i < matrix.length ; i++) {
            int[] input = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();;
            matrix[i] = input;
        }
        int number = Integer.parseInt(scan.nextLine());
        boolean check = false;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if (matrix[i][j] == number){
                    System.out.println(String.format("%d %d", i, j));
                    check = true;

                }
            }

        }
        if (!check){
            System.out.println("not found");
        }

    }
}

