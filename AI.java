// Player AI

public class AI extends Player {
  public int[][] ai;
  public AI(int[][] shipLocation){
    super(shipLocation);
    ai = new int[shipLocation.length][shipLocation[0].length];
  }
  
  public void play(Human human){
    int row = (int) (Math.random() * (ai.length * 1)) + 0;
    int col = (int) (Math.random() * (ai[0].length * 1)) + 0;
    System.out.println("AI is checking (" + row + ", " + col + ")");
    check(row, col, human.getShips());
  }
}

    