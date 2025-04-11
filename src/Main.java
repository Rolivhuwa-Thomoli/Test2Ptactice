public class Main {
    public static void main(String[] args){
    int product = 1;
        for (int i = 1; i <=15; i++){
            if(i%2 ==0 && i!=1)
                continue;
            product*=i;
            System.out.println(product);
        }

    }
}
