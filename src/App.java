import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("NUMBER GUESSING GAME");
        System.out.println("Choose difficulty:");
        System.out.println("1.Easy");
        System.out.println("2.Hard");
        System.out.println("3.Impossible");

        Scanner scan = new Scanner(System.in);

        int mode = scan.nextInt();

        int attempt = 0;

        if (mode == 1) {
            attempt = 10;
        } else if (mode == 2) {
            attempt = 5;
        } else if (mode == 3) {
            attempt = 2;
        }

        int randomNum = (int) (Math.random() * 101);
        int number, guessAttempt = 1;
        while (attempt != 0) {
            System.out.print("Enter the number: ");
            number = scan.nextInt();

            if (randomNum == number) {
                System.out.println("You won!!!");
                System.out.println("Attempts " + guessAttempt);
                break;
            } else if (randomNum > number) {
                System.out.println("Number is higher");
                attempt--;
                guessAttempt++;
                System.out.println("Attempts left: " + attempt);
            } else if (randomNum < number) {
                System.out.println("Number is lower");
                attempt--;
                guessAttempt++;
                System.out.println("Attempts left: " + attempt);
            }
        }

        if (attempt == 0)
            System.out.println("You lost the game... The correct number was " + randomNum);

        scan.close();

    }
}
