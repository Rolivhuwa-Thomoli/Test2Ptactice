import java.util.Scanner;
import java.lang.*;
public class Main{
     public static String numberStr(int num){
        if(num>0)
            return switch (num) {//No need for break statements because "return" will exit.
                case 1 -> "st";
                case 2 -> "nd";
                case 3 -> "rd";
                default -> "th";
            };
        else return "error";
     }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numValues,
        count=1;
        float minimum,input;
        System.out.print("Enter number of values: ");
        numValues = sc.nextInt();
        System.out.print("Enter the "+ count+numberStr(count)+" value: ");
        minimum = sc.nextFloat();

        do{
            count++;
            System.out.print("Enter the "+ count+numberStr(count)+" value: ");
            input = sc.nextFloat();
            minimum = Math.min(input, minimum);
        } while(count < numValues);

        System.out.printf("%s%.1f","The minimum was ", minimum);

    }
}