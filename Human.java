// Player Human
import java.util.Scanner;

public class Human extends Player {
  public int[][] human;
  public Human(int[][] shipLocation){
    super(shipLocation);
    human = new int[shipLocation.length][shipLocation[0].length];
  }
  
  Scanner scan = new Scanner(System.in);
  public void play(AI ai){
    System.out.print("Enter row: ");
    int row = scan.nextInt();
    System.out.print("Enter column: ");
    int col = scan.nextInt();
    check(row, col, ai.getShips());
  }
}
    
    