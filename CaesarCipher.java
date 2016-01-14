import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CaesarCipher {

    private static int b;
    private static int c;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();

        char a[]={'a','b','c','d','e','f','g','h'
                ,'i','j','k','l','m','n','o','p','q'
                ,'r','s','t','u','v','w','x','y','z'
                ,'A','B','C','D','E','F','G','H'
                ,'I','J','K','L','M','N','O','P','Q'
                ,'R','S','T','U','V','W','X','Y','Z'};
        for(char c:s.toCharArray()) {
            int index = indexOf(a,c);

            if (index == -1) { // Special Characters
                System.out.print(c); // Nothing to-do here
            } else if (index > -1) {

                if (index < 26) { //check for small alphabet
                    index = (index + k) % 26;
                    System.out.print(a[index]);
                } else if (index > 26) { //check for capital alphabet
                    index = (index + k) % 26;
                    index += 26;
                    System.out.print(a[index]);
                }

            }
        }

    }
    public static int indexOf(char []a , char b){
        int index=-1;

        for(int i=0;i<a.length;i++){
            if(a[i]==b){
                index=i;
                break;
            }
        }
        return index;
    }
}