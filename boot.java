import java.util.Scanner;
public class boot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name for the egoist Programme: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! Welcome to the Egoists community.");
        scanner.close();
    }
}