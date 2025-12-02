import java.util.Scanner;
public class StudentMarks {
    public static void main(String[] args){
        int[][] marks = {
                {75,80,90},//student 1
                {65,70,85},//student 2
                {88,92,81} //student 3
        };
        //print matrix
        System.out.println("Marks Table:");
        for( int i = 0;i< marks.length;i++){
            for (int j = 0;j<marks[i].length;j++){
                System.out.println(marks[i][j]+ "");
            }
            System.out.println();
        }
        // average of student 3(index 2)

        int sum = 0;
        for (int j = 0; j<marks[2].length;j++){
            sum +=marks[2][j];
        }
        double average = sum / 3.0;

        System.out.println("Average marks of student 3 is " + average);

    }
}
