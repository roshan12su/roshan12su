import java.util.Scanner;

public class swaping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        swapwithtemp(n1,n2);
        swapwithouttemp(n1,n2);
        swapusingxor(n1,n2);
    }

    public static void swapwithtemp(int n1, int n2){
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("swapped numbers with temp :- "+n1+","+n2);
    }

    public static void swapwithouttemp(int n1, int n2){
        n1 = n1+n2;
        n2 = n1-n2;
        n1 = n1-n2;
        System.out.println("Swapped number without using temp "+n1+","+n2);
    }

    public static void swapusingxor(int n1, int n2){
        n1 = n1^n2;
        n2 = n1^n2;
        n1 = n1^n2;
        System.out.println("Swapped number with xor is "+n1+","+n2);
    }
}
