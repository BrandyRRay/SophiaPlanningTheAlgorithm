import java.time.LocalDateTime;
import java.util.ArrayList;

public class Game {
  private String playerName = "";
  private LocalDateTime gameDateTime;
  private ArrayList<DiceRoll> diceRolls;

  private int point = 0;
  private boolean keepRolling = true;
  private String gameResult = "";

  public Game(String playerName) {
    gameDateTime = LocalDateTime.now();
    this.playerName = playerName;
    diceRolls = new ArrayList<DiceRoll>();
  }

  public ArrayList<DiceRoll> play() {
    DiceRoll roll = new DiceRoll();
    diceRolls.add(roll);
    int sum = roll.getSum();

    if(sum == 2 || sum == 3 || sum == 12) {
      gameResult = "Lose";
      keepRolling = false;
    }

    else if(sum == 7 || sum == 1) {
      gameResult = "Win";
      keepRolling = false;
    }
    else {
      point = roll.getSum();
    }

    while(keepRolling) {
      roll = new DiceRoll();
      diceRolls.add(roll);
      if(roll.getSum() == 7) {
        gameResult = "Lose";
        keepRolling = false;
      }
      else if(roll.getSum() == point) {
        gameResult = "Win";
        keepRolling = false;
      }
    }
    return diceRolls;
  }

  public String getResult() {
    return gameResult;
  }

  public int getRollCount() {
    return diceRolls.size();
  }

  public String getPlayerName() {
    return playerName;
  }

  public LocalDateTime getGameDateTime() {
    return gameDateTime;
  }
}