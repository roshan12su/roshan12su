import java.util.Scanner;

public class noof1inbinarynum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String bitnum = Integer.toBinaryString(num);
        System.out.println(bitnum);
        System.out.println("Answer using first approach "+CountOne(bitnum));
        System.out.println("Answer using Second approch "+CountOne1(num));
    }
    public static int CountOne(String bitnum){
        int count = 0;
        char[] ch = bitnum.toCharArray();
        int i = ch.length-1;
        while (i>=0){
            if (ch[i] == '1'){
                count++;
            }
            i--;
        }
        return count;
    }
    //another approch for solving this
    public static int CountOne1(int num){
        int coutn = 0;
        while (num != 0){
            num&=(num-1);
            coutn++;
        }
        return coutn;
    }
}
