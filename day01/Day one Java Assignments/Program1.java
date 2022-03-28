import java.util.Scanner;
public class Program1 {
public static void main(String[] args){
    System.out.println("this is my first program");
    System.out.println("enter the message you want to display");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println("the message is " +str);
}
}
