//Operator programs
import java.util.*;
public class Program5a {
    public static void main(String[] args){
        System.out.println("enter the first number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter the second number");
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        System.out.println("enter the third number");
        Scanner sc2 = new Scanner(System.in);
        int c = sc2.nextInt();
        System.out.println("a+b*c value is " + (a+b*c));
        System.out.println("c+a/b value is " + (c+a/b));
        System.out.println("a%b+c value is " + (a%b+c));
        System.out.println("a*b+c value is " + (a*b+c));
    }
}
