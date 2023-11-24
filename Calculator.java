import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st intager");
        int a = s.nextInt();
        System.out.println("Enter 2nd integer");
        int b = s.nextInt();


        System.out.println("Select an operation:");
        System.out.println("+ : Addition (+)");
        System.out.println("_ : Subtraction (-)");
        System.out.println("* : Multiplication (*)");
        System.out.println("/ : Division (/)");
        System.out.println("% : Modulo or remainder (%)");
        System.out.print("Enter the operation:(1-5) ");
        int operation = s.nextInt();

        int result = 0;
        switch (operation) {
            case 1:
                result = a + b;

                break;
            case 2:
                result = a - b;

                break;
            case 3:
                result = a * b;

                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    return;
                }
                result = a / b;

                break;
            case 5:
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    return;
                }
                result = a % b;

                break;

            default:
                System.out.println("Error: Invalid operation. Please choose a valid operation (1-5).");
                return;
        }
        
        System.out.println("Result: " + result);
    }
}   //qno 1  second slide