import java.util.*;
public class Program7 {
public static void main(String[] args){
    System.out.println("enter the year you want to check");
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    if(year%400==0){
        System.out.println("the entered year is a Leap Year ");
    }else if (year%4==0 && year%100!=0){
        System.out.println("the entered year is a Leap year");
    }else{
        System.out.println("The entered year is not a Leap Year");
    }
}
}
