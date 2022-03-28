//if-else programs
import java.util.*;
public class Program1a {
    public static void main(String[] args){
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num== 0){
            System.out.println("the entered number is : Zero");
        }else if(num == 1){
            System.out.println("the entered number is : One");
        }else if(num == 3){
            System.out.println("the entered number is : Three");
        }else if(num == 4){
            System.out.println("the entered number is : Four");
        }else if(num == 5){
            System.out.println("the entered number is : Five");
        }else if(num == 6){
            System.out.println("the entered number is : Six");
        }else if(num == 7){
            System.out.println("the entered number is : Seven");
        }else if(num == 8){
            System.out.println("the entered number is : Eight");
        }else if(num == 9){
            System.out.println("the entered number is : Nine");
        }else if(num == 2){
            System.out.println("the entered number is : Two");
        }else{
            System.out.println("Please Enter the number in between 0 to 9");
        }
    }
}
