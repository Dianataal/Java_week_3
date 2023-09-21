import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        if (name.length() >= 3) {
            System.out.println("Spelling the first three letters of your name:");
            for (int i = 0; i < 3; i++) {
                System.out.println(name.charAt(i));
            }
        }

        scanner.close();
    }
}
