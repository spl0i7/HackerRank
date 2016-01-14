import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AngryProf {
    private static ArrayList<String> result;
    public static void main(String[] args) {
        result=new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            int count=0;
            for(int a_i=0;a_i < n; a_i++){
                if(a[a_i]<=0){
                    count++;
                }
            }
            if(count < k){
                result.add("YES");
            }
            else {
                result.add("NO");
            }

        }
        for(String a :result){
            System.out.println(a);
        }
    }
}
/**
 *Sample Input

 2
 4 3
 -1 -3 4 2
 4 2
 0 -1 2 1
 Sample Output

 YES
 NO

 *
 */
