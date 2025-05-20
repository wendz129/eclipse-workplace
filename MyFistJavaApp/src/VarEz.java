public class Main { 
    public static void main(String[] args) {

        // variable = a reusable container for a value
        //            a variable behaves as if it was the value it contains

        // Primitive = simple value stored directly in memory (stack) burnout do not ask
        // Reference = memory address (stack) that points to the (heap)

        // Primitive = vs Reference
        // ---------      ---------
        // int            string
        // double         array
        // char            object
        // boolean

        // 2 Steps to creating a variable
        // ------------------------------
        // 1. declaration
        // 2. assignment

        int age = 27;
        int year = 2025;
        int quantity = 1;
        int gta = 6;

        double price = 19;
        double gpa = 2.5;
        double temperature = -12.5;
        double pi = 3.14159;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';
        char gender = 'M';

        boolean isStudent = false;
        boolean forSale = true;
        boolean isOnline = true;
        boolean isAdmin = true;

        String name = "Wendz!";
        String food = "Pizza!";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "red";

        // System.out.println("Hello " + name);
        // System.out.println("You are " + age + " years old");
        // System.out.println("Your GPA is " + gpa);
        // System.out.println("Your average letter grade is: " + grade);
        // System.out.println("Your temperature is " + temperature);

        // if(forSale) {
        //     System.out.println("This is sale now til end! " + forSale);
        // }
        // else{
        //     System.out.println("This is NOT sale now! ");
        // }

        System.out.println("Your name is " + name + " your age is " + age + " your version in gta is " + gta);
        System.out.println("The pi is " + pi + " your gender is " + gender);

        if(isAdmin) {
            System.out.println("You are admin now " + name + " this " + year + symbol);
        }
        else {
            System.out.println("You are still under training! ");
        }
    }
    
}
