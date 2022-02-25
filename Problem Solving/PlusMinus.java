import java.io.*;
import java.util.*;

class Result {
  
    //PlusMinus Method
    public static void plusMinus(List<Integer> arr) {
    
    Object[] array = arr.toArray();
        
        int plus=0,minus=0,zero=0;
        
        for(Object x: array) {
            
            int a = (Integer)x;
            
            if(a > 0)
                plus = plus + 1;
            
            else if(a == 0)
                zero = zero + 1;
            
            else
                minus = minus + 1;
            
        }
        
        float size = array.length;
        
        float plusValue = plus/size;
        float minusValue = minus/size;
        float zeroValue = zero/size;
        
        System.out.format("%6f\n",plusValue);
        System.out.format("%6f\n",minusValue);
        System.out.format("%6f\n",zeroValue);

    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
