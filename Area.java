import java.util.Scanner;
 //Question 2
public class Area {
    private static final double PI = 3.1415;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double radius = s.nextDouble();
        double area = PI * radius * radius;
        System.out.println("area of a circle is " + area);


        
    }
}