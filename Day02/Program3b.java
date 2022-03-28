//for loop
import java.util.*;
public class Program3b {
    public static void main(String[] args){
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(),rev=0;
        System.out.println("the entered number is " + num);
        for(;num!=0;){
            rev=(rev*10)+num%10;
            num = num/10;
        }
        System.out.println("the reverse of a given number is : " +rev);
    }
}
