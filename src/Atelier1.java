import java.util.Scanner;

public class Atelier1 {
    public static void main (String[] args) {
        Scanner Name = new Scanner(System.in);
        String userName;

        System.out.println("Enter Name");
        userName = Name.nextLine();

        System.out.println("Bonjour " + userName);
    }
}
