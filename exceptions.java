
import java.util.Scanner;

class Employee{
    String name;
    int age;
    float salary;

    void getData() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Name (max 20 characters): ");
            name = sc.nextLine();

            if (name.length() > 20) {
                throw new Exception("Name should not exceed 20 characters.");
            }

            System.out.print("Enter Age (greater than 5): ");
            age = sc.nextInt();
            if (age <= 5) {
                throw new Exception("Age must be greater than 5.");
            }

            System.out.print("Enter Salary (greater than 200000): ");
            salary = sc.nextFloat();
            if (salary <= 100000) {
                throw new Exception("Salary must be greater than 200000.");
            }

        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 
        finally {
            System.out.println("\nData inserted successfully");
        }
    }
}

public class exceptions {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.getData();
    }
}