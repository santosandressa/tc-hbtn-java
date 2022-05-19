import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input the limit: ");
        int limit = scanner.nextInt();

        List<Integer> primeNumbers = new ArrayList<>();

        for (int numberToCheck = 2; numberToCheck <= limit; numberToCheck++) {
            boolean isPrime = true;

            for (int factor = 2; factor <= numberToCheck / 2; factor++) {
                if (numberToCheck % factor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeNumbers.add(numberToCheck);
            }
        }
        System.out.println("Prime numbers from 1 to " + limit + " are: ");

        for (int number: primeNumbers){
            System.out.print(number + " ");
        }
    }
}
