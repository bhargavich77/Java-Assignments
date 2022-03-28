//for loop programs
import java.util.Scanner;
public class Program3a {
    public static void main(String[] args){
        System.out.println("enter the number of what you want the sum");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(),i,sum=0;
        for(i=1;i<=num;i++){
            sum = sum + i;
        }
        System.out.println("Sum of natural numbers is " +sum);
    }
}
