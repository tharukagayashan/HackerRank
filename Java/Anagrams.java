import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }else{
            char[] a_array = a.toLowerCase().toCharArray();
            char[] b_array = b.toLowerCase().toCharArray();

            Arrays.sort(a_array);
            Arrays.sort(b_array);
			
            return a_array.equals(b_array);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}