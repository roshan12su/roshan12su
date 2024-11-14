import java.util.Scanner;
//checking number is power of 2
public class powoftwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Answer using first approach "+isPowofTwo(n));
        System.out.println("Answer using second approach "+isPowoftwo1(n));
    }

    //wihtout using built in function
    public static boolean isPowofTwo(int n){
        String num = Integer.toBinaryString(n);
        System.out.println(num);
        char[] ch = num.toCharArray();
        int count = 0;
        if (n == 1){
            return true;
        }
        for (int i = 0; i < ch.length; i++) {
                if (ch[i] == '1') {
                    count++;
                }
            }
        if (count>1){
            return false;
        }
        return count == 1;
    }

    //another approach for solving this by using built in function

    public static boolean isPowoftwo1(int n){
        if (n <= 0) {
            return false;
        } return (n & (n - 1)) == 0;
    }
}
