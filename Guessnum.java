import java.util.Scanner;
public class Guessnum {
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);
        int guess = 0;
        int highestscore = 19;

        System.out.println("Guess a number between 1 and 100:");

        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            if(highestscore == 0){
                System.out.println("You failed"+"\nYour score: "+highestscore);
                break;
            }

            if (guess < secretNumber) {
                System.out.println("Too low!");
                highestscore--;
            } else if (guess > secretNumber) {
                System.out.println("Too high!");
                highestscore--;
            } else {
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("Your score: "+highestscore);
            }
        }
    }
}
