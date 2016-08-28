import java.util.Scanner;
 
public class WprowadzanieDanych {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        String firstName;
        String lastName;
        int age;
         
        System.out.println("WprowadŸ swoje imiê: ");
        firstName = input.nextLine();
        System.out.println("WprowadŸ swoje nazwisko: ");
        lastName = input.nextLine();
        System.out.println("Podaj swój wiek: ");
        age = input.nextInt();
         
        input.close();
         
        System.out.println("Czeœæ " + firstName + " " + lastName);
        System.out.println("Masz ju¿ " + age + ", staroœæ nie radoœæ! :)");
    }
}