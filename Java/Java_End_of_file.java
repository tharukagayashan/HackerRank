import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_End_of_file {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int count = 1;
        
        while(sc.hasNextLine()){
            String input = sc.nextLine();
            
            System.out.println(count + " " + input);
            count++;
        }
        
    }
}
