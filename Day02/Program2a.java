//while loop programs
import java.util.*;
public class Program2a{
    public static void main(String[] args){
        System.out.println("enter the number of what you want the sum");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), i=1, sum=0;
        while(i<=num){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of natural numbers is " +sum);
    }

}
