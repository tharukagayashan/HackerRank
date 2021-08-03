import java.io.*;
import java.util.*;

public class Java_String_Reverse{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int len = A.length();
        
        String s = A;
        int val = len-1;
        boolean flag = false;
        
        if(len-1 == 0){
            flag = true;
        }
        
        for(int i=0; i<val;i++){
            if(s.charAt(i) == s.charAt(val - i))
            {
                flag = true;
            }
            else{
                flag = false;
            }
        }
        
        if(flag == true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}
