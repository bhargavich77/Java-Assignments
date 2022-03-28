//while loop program of reversing the number
import java.util.*;
public class Program2b {
    public static void main(String[] args){
        int rev=0;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("the entered number is " + num);
        while(num>0){
            rev=(rev*10)+num%10;
            num = num/10;
        }
        System.out.println("the reverse of a given number is : " +rev);
    }
}
