import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three values: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double minimum = Math.min(Math.min(num1,num2),num3);
        System.out.printf("%s%.1f","Minimum value was : ",minimum);
    }
}