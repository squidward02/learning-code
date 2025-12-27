public class App {
    public static void main(String[] args){
        
        // ❎ variable = a reusable container for a value
        //            a variable behaves as if it was the value it contains

        // 🟥 Primitive = simple value stored directly in memory (stack)
        // 🟦 Reference = memory address (stack) that points to the (heap)

        // 🟥 Primitive vs 🟦 Reference
        // -----------    -----------
        // int            string
        // double         array
        // char           object
        // boolean
        

        // 2 Steps to creating a variable
        // ------------------------------
        // 1. declaration
        // 2. assignment

        // 1. declaration 
        // (whole number tidak boleh perpuluhan)
        int age = 21;
        int year = 2025;
        int quatity = 1;
        //  double (boleh pakai perpuluhan)
        double price = 3.5;
        double gpa = 3.8;
        double temperature = 32.4;
        //char (karakter tunggal)
        char grade = 'A';
        char currency = '$';
        char symbol = '@';
        // boolean (true or false) selepas is tu kene first letter huruf besar
        boolean isStudent = false;
        boolean forSale = false;
        boolean isRaining = false;

        // 2. assignment
        //int
        System.out.println(age);
        System.out.println("i am " + age + " years old in " + year);
        //double
        System.out.println("the price is $" + price + " per item" +
                           "\nthe gpa is " + gpa +
                           "\nthe temperature is " + temperature + " celsius");
        //char
        System.out.println("my grade is " + grade + " my currency " + currency + " my symbol is " +symbol);

        //boolean
        System.out.println(forSale);
        System.out.println(isStudent);
        System.out.println("harini hujan ke boss " + isRaining);


        // ni kalau nak check condition
        if(isStudent){
            System.out.println("i am a student");
        }
        else{
            System.out.println("i am not a student");
        }

        //string (reference) beza ni dengan char sebab char karakter tunggal, string lebih dari satu karakter ataupun huruf, symbol
        //string kena guna S huruf besar
        //pakai double quote
        String name = "Ali";
        String food = "Nasi Lemak";
        String email = "fake@gmail.com";

        System.out.println("my name is " + name);
        System.out.println("my favorite food is " + food);
        System.out.println("my email is " + email);

        System.out.println("my name is " + name + " my age is " + age + " my grade is " + grade);
        System.out.println("my currency is " + currency + " the price is $" + price + " per item");   

        if(isStudent){
            System.out.println("i am a student and my name is " + name + " my age is " + age);
        }
        else{
            System.out.println("i am not a student and dont ask my name which is" + name + " and my age is " + age);
        }
    }
}
