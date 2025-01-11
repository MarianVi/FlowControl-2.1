
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TO DO:

        int n = scanner.nextInt();
        int crtNumber = scanner.nextInt();
        int minValue = crtNumber;
        int maxValue = crtNumber;
        int sum = crtNumber;

        for (int i = 2; i <= n; i++) {
            crtNumber = scanner.nextInt();

            if (crtNumber < minValue) {
                minValue = crtNumber;
            } else if (crtNumber > maxValue) { // 2.1. 2
                maxValue = crtNumber;
            }

            sum += crtNumber;
        }

        System.out.println("Numarul minim: " + minValue);
        System.out.println("Numarul maxim: " + maxValue);
        System.out.println("Media aritmetica: " + (sum * 1.0d / n));
    }
}
