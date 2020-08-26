import java.util.*;

public class WrongMeasurement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int[][] matrix = new int[number][];
        List<Integer> newNumber = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            int[] input = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = input;
        }
        int[] positionWrongValue = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int wrongNumber = matrix[positionWrongValue[0]][positionWrongValue[1]];
        for (int i = 0; i < number ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                if (matrix[i][j] == wrongNumber){
                    int sum = 0;
                    if (i - 1 >= 0 && matrix[i-1][j] != wrongNumber ){
                        sum += matrix[i-1][j];
                    }
                    if (j - 1 >= 0 && matrix[i][j-1] != wrongNumber){
                        sum += matrix[i][j-1];
                    }
                    if (i + 1 < number && matrix[i+1][j] != wrongNumber ){
                        sum += matrix[i+1][j];
                    }
                    if (j + 1 < matrix[i].length && matrix[i][j+1] != wrongNumber){
                        sum += matrix[i][j+1];
                    }
                    //matrix[i][j] = sum;
                    newNumber.add(sum);
                    newNumber.add(i);
                    newNumber.add(j);
                }

            }

        }
        for (int i = 0; i < newNumber.size() ; i+=3) {
            matrix[newNumber.get(i + 1)][newNumber.get(i + 2)] = newNumber.get(i);
        }

        for (int i = 0; i < number ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }
}
