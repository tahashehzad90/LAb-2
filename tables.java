import java.util.Scanner;
 //Question 3
public class tables {

    public static void main(String[] args) {
        Scanner jamiscanner = new Scanner(System.in);
        System.out.println("Enter the number which you want to make a table");
        int num = jamiscanner.nextInt();
        for (int i = 1; i < 11; i++) {
            int a = i * num;
            System.out.println(num +"*"+i+"=" +a);
 }
}
}