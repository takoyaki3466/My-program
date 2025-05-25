import java.util.Random;
import java.util.Scanner;

public class Main {
    static boolean numberOfMatches;
    static int winInt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfMatchesInt = 0;
        while(numberOfMatchesInt != 5){
            System.out.print("your hand(0:ROCK , 1:PAPER , 2:SCISSORS) is : ");
            int myHand = sc.nextInt();
            if (myHand >= 3 || myHand < 0){
                System.out.println("Keep it below 2!!!!!!");
                continue;
            }
            RPS(myHand);
            if (numberOfMatches) numberOfMatchesInt++;
        }
        System.out.println("--------------RESULT--------------");
        if (winInt == 0)System.out.println("Draw~");
        else if (winInt > 0) System.out.println("You're winner...");
        else System.out.println("I'm winner!!!");
    }

    public static void RPS(int myHand){
        Random rnd = new Random();
        int opponentHand = rnd.nextInt(3);
        numberOfMatches = true;
        switch (opponentHand){
            case 0 : System.out.println("My hand is ROCK"); break;
            case 1 : System.out.println("My hand is PAPER"); break;
            case 2 : System.out.println("My hand is SCISSORS");
        }
        switch (opponentHand - myHand){
            case -2, 1 : winInt--; System.out.println("I'm winner!"); break;
            case -1, 2 : winInt++; System.out.println("you're winner..."); break;
            case 0 : numberOfMatches = false; System.out.println("Draw~");
        }
    }
}
