//for loop programs
import java.util.*;
public class Program3c {
    public static void main(String[] args){
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(),reve=0;

        System.out.println("the entered number is " + num);
        for(;num!=0;){
            reve=(reve*10)+num%10;
            num = num/10;
        }
        System.out.println("the reverse of a given number is : " +reve);
        if(reve==num){
            System.out.println("the given number is a pallindrome");
        }else{
            System.out.println("the given number is not a pallindrome");
        }
    }

}
