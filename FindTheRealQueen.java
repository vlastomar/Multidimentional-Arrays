import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][] matrix = new String[8][8];
        List<Integer> rowList = new ArrayList<>();
        List<Integer> colList = new ArrayList<>();

        for (int i = 0; i < 8 ; i++) {
            String[] input = scan.nextLine().split("\\s+");
            matrix[i] = input;
        }

        for (int i = 0; i < 8 ; i++) {
            for (int j = 0; j < 8 ; j++) {
                if (matrix[i][j].equals("q")){
                    if (!rowList.contains(i) && !colList.contains(j)){
                        rowList.add(i);
                        colList.add(j);
                    }else if (rowList.contains(i)){
                        int temp = rowList.indexOf(i);
                       rowList.remove(temp) ;
                       colList.remove(temp);
                    }else if (colList.contains(j)){
                        int temp = colList.indexOf(j);
                        rowList.remove(temp) ;
                        colList.remove(temp);
                    }

                }

            }

        }
        if (rowList.size() > 1){
            for (int i = 0; i < rowList.size() ; i++) {
                for (int j = i + 1; j <rowList.size(); j++) {
                    int temp1 = Math.abs(rowList.get(i) - rowList.get(j)) ;
                    int temp2 = Math.abs(colList.get(i) - colList.get(j));
                    if (temp1 == temp2){
                        rowList.remove(j);
                        rowList.remove(i);
                        colList.remove(j);
                        colList.remove(i);
                    }
                }

            }
        }
        for (int i = 0; i < rowList.size() ; i++) {
            System.out.print(rowList.get(i) + " " + colList.get(i));

        }
    }
}
