import java.util.Scanner;
public class TwoDArray {
    public static void main(String[]args){
        int[][] marks ={
                {80,70,90},
                {60,85,75},
                {88,92,79},
        };
        System.out.println("student Marks:");
        for( int i = 0;i<marks.length;i++){
            for(int j = 0;j<marks.length;j++){
                System.out.println(marks[i][j] + "");
            }
            System.out.println();
        }
        int sum = 0;
        for(int j =0;j<marks[0].length;j++){
            sum +=marks[0][j];
        }
        double average =sum /3.0;

        System.out.println("Average of the first row:" + average);

    }
}
