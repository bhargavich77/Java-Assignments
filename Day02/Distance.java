import java.lang.Math;
import java.util.*;
public class Distance {
    public static void main(String[] args){
        int x,y;
        Scanner sc=new Scanner(System.in);
        x= sc.nextInt();
        y= sc.nextInt();
        int a= (x*x);
        int b= (y*y);
        System.out.println("the first value is "+ x);
        System.out.println("the second value is "+ y);
        System.out.println("the value is " + Math.pow(a,b));
    }
}
