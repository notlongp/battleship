//Lucas Pham
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int[][] humanGrid = {{1, 0, 1, 1, 1},
                            {1, 0, 0, 0, 0},
                            {0, 0, 0, 0, 1},
                            {0, 0, 0, 0, 1},
                            {0, 0, 0, 0, 0}};
        int[][] aiGrid = {{0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 1, 0, 0, 0},
                        {0, 1, 0, 1, 1}};

        AI ai = new AI(aiGrid);
        Human human = new Human(humanGrid);

        boolean humanWon = false;
        boolean aiWon = false;

        Scanner scan = new Scanner(System.in);

        while (humanWon == false && aiWon == false){
            ai.printGuessed("AI");
            human.printGuessed("Human");
            System.out.println("Play (1=yes, 0=no)?");
            int input = scan.nextInt();
            if (input == 0)
                break;

            human.play(ai);
            ai.play(human);

            humanWon = human.won(ai.getShips());
            aiWon = ai.won(human.getShips());
        }

        if (humanWon == true)
            System.out.println("Human won!");
        else
            System.out.println("AI won!");
    }
}
