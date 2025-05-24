import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {
    
    // if statement = performs a block of code if its condition is true

        Scanner scanner = new Scanner(System.in);

        int age;

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        if(age >= 65){
            System.out.println("You are a senior!");
        }
        else if(age >= 18){
            System.out.println("You are an adult!");
        }
        else if(age < 0){
            System.out.println("You haven't born yet!");
        }
        else if(age == 0){
            System.out.println("You are a baby!");
        }
        else{
            System.out.println("You are a child!");
        }

    }
}


