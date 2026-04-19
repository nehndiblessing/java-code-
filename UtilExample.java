import java.util.Scanner;  // Import Scanner class

public class UtilExample {
    public static void main(String[] args) {
        
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();  // Read full line input

        System.out.println("Welcome " + name);

        sc.close();  // Close scanner to prevent resource leak
    }
}
