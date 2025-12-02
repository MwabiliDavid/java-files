import java.util.Scanner;
 // Arrays -1D

public class Arrays{
    public static void main(String[] args){

        int[] numbers = {5,10,15,20,25};
        int sum = 0;

        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
            sum +=numbers[i];
        }
        System.out.println( "The sum is:" + sum);
    }
}

