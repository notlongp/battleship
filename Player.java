// Player class

public class Player {
  protected int[][] player, ships;
  
  public Player(int[][] shipLocation){
    this.ships = shipLocation;
    player = new int[ships.length][ships[0].length];
  }
  
  public int[][] getShips(){
    return ships;
  }
  
  public void check(int setX, int setY, int[][] shipLocation){
    if (shipLocation[setX][setY] == 1){
      player[setX][setY] = 1;
      System.out.println("Hit!");
      System.out.println();
    }
    else {
      player[setX][setY] = -1;
      System.out.println("Miss");
      System.out.println();
    }
  }
  
  public void printGuessed(String setDescription){
    System.out.println(setDescription + ": ");
    System.out.print(" ");
    for (int col = 0; col < player[0].length; col++)
      System.out.print(col);
    System.out.println();
    for (int row = 0; row < player.length; row++) {
      System.out.print(row);
      for (int col = 0; col < player[0].length; col++) {
        if (player[row][col] == 1)
          System.out.print("X");
        else if (player[row][col] == -1)
          System.out.print("O");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
    System.out.println();
  }
  
  public boolean won(int[][] ships) {
    for (int row = 0; row < ships.length; row++)
      for (int col = 0; col < ships[0].length; col++)
        if (player[row][col] != 1 && ships[row][col] == 1)
          return false;
    return true;
  }
  
}