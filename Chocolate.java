import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Chocolate {

    public static void main(String[] args) {
        Scanner stdin=new Scanner(System.in);
        int n=stdin.nextInt(),k=stdin.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++) prices[i]=stdin.nextInt();
        int j;                     
        int key;                
        int i;

        for (j = 1; j < prices.length; j++)    
        {
            key = prices[ j ];
            for(i = j - 1; (i >= 0) && (prices[ i ] > key); i--)   
            {
                prices[ i+1 ] = prices[ i ];
            }
            prices[ i+1 ] = key;    
        }
        key=0;
        int total=0;
        while(k >0){
            i=k-prices[key];
            if(i>0){
                k=k-prices[key];
                total++;
            }
            else break;
            key++;
        }

        int answer = 0;
        // Compute the final answer from n,k,prices
        System.out.println(total);
    }
}
