import java.util.Scanner;

public class pownumwithoutbuiltinfunction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base :- ");
        int base = in.nextInt();
        System.out.print("Enter exponent :- ");
        int exponent = in.nextInt();
        System.out.println(PowNum(base, exponent));
    }

    public static double PowNum(int base, int exponent){
        double ans = 1;

        if (exponent > 0){
            for (int i = 1; i <= exponent; i++) {
                ans = ans*base;
            }
            return ans;
        }
            if (exponent<0){
                exponent = Math.abs(exponent);
        for (int i = 1; i <= exponent; i++) {
            ans = ans*base;
        }
        return 1/ans;
        }
        return 0;
    }
}
