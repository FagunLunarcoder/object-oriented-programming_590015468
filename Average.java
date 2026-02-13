import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks 1:");
        float a = sc.nextFloat();

        System.out.println("Enter marks 2:");
        float b = sc.nextFloat();

        System.out.println("Enter marks 3:");
        float c = sc.nextFloat();

        System.out.println("Enter marks 4:");
        float d = sc.nextFloat();

        System.out.println("Enter marks 5:");
        float e = sc.nextFloat();

        float average = (a + b + c + d + e) / 5;

        System.out.println("Average = " + average);
    }
}