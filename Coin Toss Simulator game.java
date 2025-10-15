import java.util.Random;
import java.util.Scanner;

public class CoinTossSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int headsCount = 0;
        int tailsCount = 0;

        System.out.println("=== Coin Toss Simulator ===");

        while (true) {
            System.out.print("Press Enter to toss the coin (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            // Toss the coin: 0 for heads, 1 for tails
            int toss = random.nextInt(2);
            if (toss == 0) {
                System.out.println("Result: HEADS");
                headsCount++;
            } else {
                System.out.println("Result: TAILS
u
