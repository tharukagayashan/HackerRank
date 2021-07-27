import java.io.*;
import java.util.*;

public class Java_Strings_Introduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        String str = A + B;
        int len = str.length();
        
        char a = A.charAt(0);
        char b = B.charAt(0);
        
        String toUpperA = A.substring(0,1).toUpperCase();
        String toUpperB = B.substring(0,1).toUpperCase();
        
        String YesNo = "";
        if(a > b)
            YesNo = "Yes";
        else
            YesNo = "No"; 
            
        System.out.println(len);
        System.out.println(YesNo);
        System.out.println(toUpperA + A.substring(1) + " " + toUpperB + B.substring(1));
        
    }
}
