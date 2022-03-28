public class Program6 {
static int a =10;
static int b;
static void display(int c){
    System.out.println("a = " +a);
    System.out.println("b = " +b);
    System.out.println("c = " +c);
}
static{
    System.out.println("static block");
    b = a + 15;
}
public static void main(String[] args){
    display(23);
}
}
