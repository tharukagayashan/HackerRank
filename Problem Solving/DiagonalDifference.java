import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        Integer listSize = arr.size();
        Integer leftTorightSum = 0;
        Integer rightToLeftSum = 0;
        Integer def = 0;
        for (Integer i = 0; i < listSize; i++) {
            leftTorightSum = leftTorightSum + arr.get(i).get(i);
            System.out.println("Left To Right : " + i);
            System.out.println("Left To Right SUM : " + leftTorightSum);
        }
        for (Integer j = 0; j < listSize; j++) {
            for (Integer k = listSize - (j + 1); k >= 0; k--) {
                rightToLeftSum = rightToLeftSum + arr.get(j).get(k);
                System.out.println("Right To Left : " + j);
                System.out.println("Right To Left SUM : " + rightToLeftSum);
                break;
            }
        }
        def = leftTorightSum - rightToLeftSum;
        return Math.abs(def);
    }

}

public class DiagonalDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
