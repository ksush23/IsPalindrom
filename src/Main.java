import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String result = line.replaceAll("[^a-zA-Z0-9]", "");
        result = result.toLowerCase();

        StringBuilder reverse = new StringBuilder(result);
        reverse.reverse();
        String reverseString = new String(reverse);

        System.out.println(result.equals(reverseString));
    }
}
