public class Main {
    public static void main(String[] args) {
        //lets loop 5 times break the loop for 6 steps the continue for another 5 steps
        for(int i =1; i<=16 ; i++) {
            if(i>=6 && i<=12)
                continue; // continue skips the rest of the code
            System.out.println("loop"+i);

        }
    }
}