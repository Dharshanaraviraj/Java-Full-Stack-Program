import java.util.Scanner;
import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();
        int randomNumber = random.nextInt(upperLimit);
        System.out.println("Random number between 0 and " + upperLimit + ": " + randomNumber);
    }
}
