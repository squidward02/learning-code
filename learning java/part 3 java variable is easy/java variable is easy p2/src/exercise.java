import java.util.Scanner;

public class exercise {
    public static void main(String[] args){
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Enter width: ");
        width = scanner.nextDouble();

        System.out.print("enter height: ");
        height = scanner.nextDouble();

        area = width * height;
        System.out.println("the area is " + area + " cm squared");

        scanner.close();
    }
    
}
