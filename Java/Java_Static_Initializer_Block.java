import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_Static_Initializer_Block {
    
    static Scanner sc = new Scanner(System.in);
    static boolean flag = true;
    static int B;
    static int H;
    
    static{
        
        B = sc.nextInt();
        H = sc.nextInt();
        
        try{
            if(B<=0 || H<=0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

