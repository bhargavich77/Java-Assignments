import java.util.Scanner;
public class Program3 {
public static void main(String[] args){
    System.out.println("Enter the First String Name ");
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    System.out.println("Enter the Second String Name");
    String str2 = sc.nextLine();
    System.out.println(str1.equals(str2));
}
}
