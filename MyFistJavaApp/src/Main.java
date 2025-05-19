import java.util.Scanner;


// User INPUT

public class Main { 
    public static void main(String[] args) {
    	
    	double width = 0;
    	double height = 0;
    	double area = 0;
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Enter the width: ");
    	width = scanner.nextDouble();
    	
    	System.out.println("Enter the height: ");
    	height = scanner.nextDouble();
    	
    	area = width * height;
    	
    	System.out.println("The area is " + area);
    	
    	
    	
    	
//    	Scanner scanner = new Scanner(System.in);
    	
//    	System.out.println("Enter your age: ");
//    	int age = scanner.nextInt();
//    	scanner.nextLine();
//    	
//    	System.out.print("Enter your favorite color: ");
//    	String color = scanner.nextLine();
//    	
//    	System.out.println("Your are " + age + " years old");
//    	System.out.println("You like the color " + color);
    	
//    	System.out.println("Enter your name: ");
//    	String name = scanner.nextLine();
//    	
//    	System.out.println("Enter your age: ");
//    	int age = scanner.nextInt();
//    	
//    	System.out.println("What is your gpa: ");
//    	double gpa = scanner.nextDouble();
//    	
//    	System.out.println("Are you a student? (true/false): ");
//    	boolean isStudent = scanner.nextBoolean();
//    	
//    	
//    	System.out.println("Hello " + name);
//    	System.out.println("You are " + age + " years old!");
//    	System.out.println("Your gpa is " + gpa);
//    	System.out.println("Student: " + isStudent );
//    	
//    	if(isStudent) {
//    		System.out.println("You are enrolled as a student");
//    	}
//    	else {
//    		System.out.println("You are NOT enrolled");
//    	}
//    	
    	scanner.close();

    }   
}