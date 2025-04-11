import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SENTINEL = -999,
                mark ,
                sum = 0,
                count = 0;
        double average;
        /////////////////////////////////////////////////////////
        //looping
        do{
            System.out.println("Enter test mark: ");
            mark = sc.nextInt();
            if(mark <0 || mark >100 || mark == SENTINEL)
                continue;
            sum +=mark;
            count++;

        } while (mark != SENTINEL);

        average = (double) sum/count;
        System.out.printf("%s%.1f", "Average is : ", average);

    }
}