//spring season
import java.util.*;
public class Program5b {
    public static void main(String[] args){
        System.out.println("enter the month value");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        System.out.println("Entered month is : "+month);
        System.out.println("enter the day value");
        Scanner sc1 = new Scanner(System.in);
        int day = sc1.nextInt();
        System.out.println("Entered day is : "+day);
        if((month>=3 && day<=20) &&(month<=6 && day <=20)){
            System.out.println("the values are in given range");
        }else{
            System.out.println("the values are not in given range");
        }

    }
    //public static boolean (int m,int d){

    }



