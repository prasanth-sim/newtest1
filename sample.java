import java.util.Scanner;

public class SampleJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "! Welcome to Java.");
        
        scanner.close();
    }
}
