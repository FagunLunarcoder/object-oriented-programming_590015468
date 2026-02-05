import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input of two strings from user
        System.out.print("Enter first fruit name: ");
        String fruit1 = sc.nextLine();

        System.out.print("Enter second fruit name: ");
        String fruit2 = sc.nextLine();

        // Checking if strings are same
        if (fruit1.equals(fruit2)) {
            System.out.println("The two fruits are the same!");
        } else {
            System.out.println("The two fruits are different!");
        }

        sc.close();
    }
}