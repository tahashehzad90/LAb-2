	public class VariableType {
	    public static void main(String[] args) {
	     //Question 1
        String name = "John";
        int age = 25;
        double salary = 50000.50;
        char gender = 'M';
        boolean isStudent = true;

        System.out.println("Person Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        System.out.println("Gender: " + gender);
        System.out.println("Is a student: " + isStudent);
    }
}
public class Area {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double radius = s.nextDouble();
        double area = PI * radius * radius;
        System.out.println("area of a circle is " + area);

	
        
}}