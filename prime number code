import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        isPrime(a);
    }

    public static void isPrime(int n){
        if (n == 1 || n == 2){
            System.out.println("The number is prime");
        }else {
            int a = 0;
            for (int i = 2; i < n; i++) {
                int x = n % i;
                System.out.println(x);
                if (x == 0) {
                    a = 1;
                    break;
                }
            }
            if (a == 1) {
                System.out.println("Number is non-prime");
            } else {
                System.out.println("Number is prime");
            }
        }
    }
}
