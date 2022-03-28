//switch programs
import java.util.*;
public class Program4a {
    public static void main(String[] args) {
        boolean vowel=false;
        System.out.println("Enter Character:");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                vowel=true;
        }
        if(vowel==true) {
            System.out.println(ch+ " : is a vowel");
        }
        else {
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
                System.out.println(ch+ " : is a consonant");
        }
    }

}

