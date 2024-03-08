import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> response = new ArrayList<>();

        for (Integer i:grades) {
            if (i >= 40){
                if (i % 5 >= 3){
                    i = i + (5 - (i%5));
                    response.add(i);
                }
                else {
                    response.add(i);
                }
            }else if (i >= 38){
                if (i == 38){
                    i = i + 2;
                    response.add(i);
                }else{
                    i = i + 1;
                    response.add(i);
                }
            }else {
                response.add(i);
            }
        }
        return response;
    }

}

public class GradingStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < gradesCount; i++) {
            int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
            grades.add(gradesItem);
        }

        List<Integer> result = Result.gradingStudents(grades);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
