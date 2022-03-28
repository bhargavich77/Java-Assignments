import java.util.*;
public class Quadratic {
public static void main(String[] args){
    // value a, b, and c
    double a = 3, b = 4, c = 5;
    double root1, root2;

    // calculate the determinant (b2 - 4ac)
    double determinant = (b * b - 4 * a * c);
    root1 = (-b + Math.sqrt(determinant)) / (2 * a);
    root2 = (-b - Math.sqrt(determinant)) / (2 * a);
    System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);


}


}
