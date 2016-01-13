import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GameOfThrones_Anagram {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
        int frequency[]=new int[26];
        for(int i:frequency){
            i=0;
        }
        for(int i=0;i<inputString.length();i++){
            char tmp=inputString.charAt(i);
            tmp=Character.toUpperCase(tmp);
            frequency[tmp-65]++;
        }
        int largest=0;
        int smallest;
        for(int i=0;i<frequency.length;i++){
            largest=frequency[i];
            if(largest<frequency[i]){
                largest=frequency[i];
            }
        }
        smallest=largest;
        for(int i=0;i<frequency.length;i++){
            smallest=frequency[i];
            if(smallest>frequency[i] && frequency[i]!=0){
                smallest=frequency[i];
            }
        }
        int numberOfOdd=0;
        for(int i=0;i<frequency.length;i++){
            if(frequency[i]%2 != 0){
                numberOfOdd++;
            }
        }
        if(numberOfOdd>1){
           System.out.println("NO");
        }
        else if(largest %2 ==1 && numberOfOdd ==1 ){
            System.out.println("YES");
        }
        else {
            System.out.println("YES");
        }

    }
}
