import java.util.Scanner;
 
public class WprowadzanieDanych {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        String firstName;
        String lastName;
        int age;
         
        System.out.println("Wprowad� swoje imi�: ");
        firstName = input.nextLine();
        System.out.println("Wprowad� swoje nazwisko: ");
        lastName = input.nextLine();
        System.out.println("Podaj sw�j wiek: ");
        age = input.nextInt();
         
        input.close();
         
        System.out.println("Cze�� " + firstName + " " + lastName);
        System.out.println("Masz ju� " + age + ", staro�� nie rado��! :)");
    }
}