import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numOfValues;
        float  minimum ,inputNum;
        System.out.print("Enter number of values to compare: ");
        numOfValues = sc.nextInt();
        System.out.println();
        System.out.print("Enter a value to compare: ");
        minimum = sc.nextFloat();
        for(int i = 1; i<numOfValues; i++){
            System.out.print("Enter a value to compare: ");
            inputNum = sc.nextFloat();
            //System.out.println();
            minimum = (inputNum<minimum) ? inputNum : minimum;
        }
       System.out.printf("%s%.1f","Minimum was ", minimum);

    }
}
