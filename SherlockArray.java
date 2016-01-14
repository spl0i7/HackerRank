import java.util.ArrayList;
import java.util.Scanner;
public class SherlockArray {
    private static int N; // No of elements
    private static int T; //Test case
    private static int[] C; //Array of elements
    private static int count;
    private static ArrayList<Boolean> result;
    private static int sumR;
    private static int sumL;
    private static int sumT;
    private static boolean flag = false;

    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                T = scanner.nextInt();
                result = new ArrayList<Boolean>();
                count = 0;
                long start = System.currentTimeMillis();
                while (count != T) {
                    sumL = 0;
                    sumR = 0;
                    sumT = 0;
                    N = scanner.nextInt();
                    C = new int[N];
                    flag = false;
                    for (int i = 0; i < N; i++) {
                        C[i] = scanner.nextInt();
                    }
                    //sum of array
                    for (int i = 0; i < N; i++) {
                        sumT += C[i];
                    }
                    for (int i = 0; i < N; i++) {
                        sumL = 0;
                        sumR = 0;
                        for (int j = i + 1; j < N; j++) {
                            sumR += C[j];

                        }
                        sumL = sumT - (C[i] + sumR);
                        if (sumL == sumR) {
                            result.add(true);
                            flag = true;
                            break;
                        } else if (flag == false && i == N - 1) {
                            result.add(false);
                        }
                    }
                    count++;
                }
                for (Boolean name : result) {
                    if (name)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
              //  System.out.println("TIME : " + (System.currentTimeMillis() - start));

    }

}


