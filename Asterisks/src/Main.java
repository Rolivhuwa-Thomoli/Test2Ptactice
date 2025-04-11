import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int numRows ;
        Scanner sc = new Scanner(System.in);
        //System.out.print(2%1000);
        System.out.print("Enter number of rows: ");
        numRows = sc.nextInt();
        for (int i = 1; i<= numRows*numRows; i++){
            System.out.print("*");
            if(i%numRows ==0)// dividing the * when they are perfectly divisible by numRows
                System.out.println();
        }

    }
}
