//untuk guna scanner kita perlu import dulu
//kegunaan scanner adalah untuk mengambil input dari user
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //scanner
        //kenapa ada dua scanner? sebab ada dua input yang berbeza
        //1. scanner untuk input dari user
        //2. scanner untuk input dari file
        //disini kita guna scanner untuk input dari user
        //System.in bermaksud input dari user
        //jadi kita perlu buat objek scanner dulu
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your name: ");
        //nextLine() bermaksud kita nak ambil input dalam bentuk string
        //kalau kita nak ambil input dalam bentuk integer, kita boleh guna nextInt()
        //kenapa tidak guna nextString()? sebab dalam kelas Scanner, tidak ada method nextString()
        // kita boleh  guna next() untuk ambil input dalam bentuk string
        String name = scanner.nextLine(); 
        System.out.println("hello " + name);

        //contoh lain guna scanner
        System.out.print("enter your age: ");
        //nextInt() bermaksud kita nak ambil input dalam bentuk integer
        //kenapa kita tidak gunaka nextLine()?
        //sebab kalau kita guna nextLine(), kita perlu convert dulu dari string ke integer
        //jadi lebih mudah guna nextInt()
        int age = scanner.nextInt();
        System.out.println("you are " + age + " years old");

        System.out.println("awak ada berapa ringgit? ");
        Double price = scanner.nextDouble();
        System.out.println("you have " + price + " ringgit");

        System.out.println("are you married? (true/false) ");
        boolean isMarried = scanner.nextBoolean();
        //System.out.println("married status: " + isMarried);

        if(isMarried){
            System.out.println("you are married");
        }else{
            System.out.println("you are not married");
        }
        


        //kalau kita tidak buat scanner close, nanti akan ada memory leak
        //jadi selepas guna scanner, kita perlu close
        scanner.close();
    }
}
