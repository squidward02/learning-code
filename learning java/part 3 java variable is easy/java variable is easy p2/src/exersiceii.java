import java.util.Scanner;

public class exersiceii {
    public static void main (String[] args){
        // ===============================
// EASY → MEDIUM JAVA PRACTICE
// Based on what you have learned
// ===============================


// -------------------------------
// QUESTION 1 (EASY)
// Topic: Scanner + double + int
// -------------------------------
// Task:
// 1. Ask user to enter price of 1 item
// 2. Ask user to enter quantity
// 3. Calculate total price
// 4. Display the total price
//
// Example Output:
// Enter price: 3.50
// Enter quantity: 4
// Total price is RM14.0
//
// Hint:
// - price → double
// - quantity → int
// - total = price * quantity

        Scanner scanner = new Scanner(System.in);
            double price = 0;
            int quantity = 0;
            double total = 0;

            System.out.print("Enter price: ");
            price = scanner.nextDouble();

            System.out.print("Enter quantity: ");
            quantity = scanner.nextInt();
        
            total = price * quantity;
            System.out.println("total price is RM " + total);
    

// -------------------------------
// QUESTION 2 (EASY)
// Topic: boolean + if-else
// -------------------------------
// Task:
// 1. Create a boolean variable called isRaining
// 2. If isRaining is true, print "Bring an umbrella"
// 3. Else print "No need umbrella"
//
// Hint:
// - Scanner not needed
// - Use if (isRaining)

boolean isRaining = true;
    if (isRaining){
        System.out.println("tolong bawak payung");
    }else{
        System.out.println("takyah bawak payung");
    }


// -------------------------------
// QUESTION 3 (MEDIUM)
// Topic: Scanner + if-else
// -------------------------------
// Task:
// 1. Ask user to enter age
// 2. If age is 18 or above, print "You are allowed to vote"
// 3. Else print "You are not allowed to vote"
//
// Hint:
// - Use int age
// - Condition: age >= 18

        System.out.println("enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18){
            System.out.println("you are allowed to vote");
        }else{
            System.out.println("you are not allowed to vote");
        }


// -------------------------------
// QUESTION 4 (MEDIUM)
// Topic: String + boolean
// -------------------------------
// Task:
// 1. Create a String variable for name
// 2. Create a boolean variable isStudent
// 3. If isStudent is true, print "<name> is a student"
// 4. Else print "<name> is not a student"
//
// Hint:
// - Use string concatenation with +

        String name = "Abdul";
        boolean isStudent = false;
        if (isStudent){
            System.out.println(name + " is a student");
        }else{
            System.out.println(name + " is not a student");
        }


// -------------------------------
// CHALLENGE (MEDIUM)
// Topic: Scanner + double + if-else
// -------------------------------
// Task:
// 1. Ask user to enter GPA
// 2. If GPA >= 3.5, print "Excellent"
// 3. Else if GPA >= 3.0, print "Good"
// 4. Else print "Needs improvement"
//
// Hint:
// - Use double gpa
// - Use if, else if, else
        double gpa = 0;
        System.out.println("enter your gpa: ");
        gpa =scanner.nextDouble();
        if (gpa >= 3.5){
            System.out.print("excellent");
        }else if(gpa >= 3.0){
            System.out.println("good");
        }else{
            System.out.println("need improvement");
        }
        
        scanner.close();
    }
}
