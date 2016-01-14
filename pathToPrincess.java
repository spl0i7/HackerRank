import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class pathToPrincess {
    static void displayPathtoPrincess(int n, String [] grid){

        int botPosRow=findRow(n,grid,'m');
        int botPosColumn=findColumn(botPosRow,grid,'m',n);
        int princessPosRow=findRow(n,grid,'p');
        int princessPosColumn=findColumn(princessPosRow,grid,'p',n);
        System.out.println(" Bots Pos ->("+botPosRow+","+botPosColumn+")");
        System.out.println(" Princess Pos ->("+princessPosRow+","+princessPosColumn+")");
        //TRAVEL THE COLUMN
        boolean condition=true;
        //condition to travel in column
        while(condition){
            if(botPosColumn==princessPosColumn){
                condition=false;
            }
            else if(botPosColumn<princessPosColumn){
                while(botPosColumn!=princessPosColumn){
                    System.out.println("RIGHT");
                    botPosColumn++;
                }

            }
            else if(botPosColumn>princessPosColumn){
                while(botPosColumn!=princessPosColumn){
                    System.out.println("LEFT");
                    botPosColumn--;
                }
            }
        }
        condition=true;
        while(condition){
            if(botPosRow==princessPosRow){
                condition=false;

            }
            else if(botPosRow<princessPosRow){
                while(botPosRow!=princessPosRow){
                System.out.println("DOWN");
                botPosRow++;
            }}
            else if(botPosRow>botPosRow){
                while(botPosRow!=princessPosRow){
                    System.out.println("UP");
                    botPosRow--;
                }
            }
        }
    }
    static int findColumn(int botPosRow,String[] grid,char p,int n){
        int column=0;
        for(int i=0;i<n;i++){
            if(grid[botPosRow].charAt(i)==p){
                column=i;
                break;
        }
        }
        return column;
    }
    static int findRow(int n, String [] grid,char p){
        int row=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i].charAt(j)==p){
                    row=i;
                    break;
                }
            }
        }
        return row;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String grid[] = new String[m];
        for(int i = 0; i < m; i++) {
            grid[i] = in.next();
        }
        displayPathtoPrincess(m,grid);
    }
}
