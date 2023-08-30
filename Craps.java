import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;

public class Craps {
  public static void main(String[] args) {
    int winCount = 0;
    int lossCount = 0;
    int gameCount = 0;
    int rollCount = 0;

    File logFile = new File("game.log.txt");

    Scanner input = new Scanner(System.in);
    //String playerName = "";
    System.out.print("Enter player name: ");
    String playerName = input.nextLine();

    System.out.println("\nRunning Sample Game: ");
    Game game = new Game(playerName);
    ArrayList<DiceRoll> rolls = game.play();
    for(DiceRoll roll : rolls) {
      System.out.println("\t" + roll);
    }
    System.out.println("\nResult of sample game: " + game.getResult() + " in " + game.getRollCount() + " roll(s)\n");
    System.out.println();

    boolean inputValid = false;
    int numberOfGamesToPlay = 0;

    while(!inputValid) {
      try {
        System.out.print("How many games would you like to play? ");
        numberOfGamesToPlay = input.nextInt();
        inputValid = true;
      }
      catch(InputMismatchException ex) {
        System.out.println("Not a valid number");
        input.nextLine();
      }

      
    }
    System.out.println();

    for(int i = 0; i < numberOfGamesToPlay; i++) {
      game = new Game(playerName);

      System.out.println("Game " + (i + 1) + ":");
      rolls = game.play();
      rollCount += game.getRollCount();
      for(DiceRoll roll : rolls) {
        System.out.println("\t" + roll);
      }
      if(game.getResult().equals("Win")) {
        winCount++;
      }
      else {
        lossCount++;
      }
      System.out.println("\nResult: " + game.getResult() + " in " + game.getRollCount() + " roll(s)\n");
    }

    String summary = "Statistics for " + game.getPlayerName() + ": " + "\n";
    String gameDateTimeFormatString = "MM/dd/YYYY HH:mm:ss\n";
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(gameDateTimeFormatString);
    summary += "Game Date & Time: ";
    summary += dateTimeFormatter.format(game.getGameDateTime());
    summary += "# of Games: " + numberOfGamesToPlay + "\n";
    summary += "# of Dice Rolls: " + rollCount + "\n";
    summary += "# of Wins: " + winCount + "\n";
    summary += "# of Losses: " + lossCount + "\n";
    DecimalFormat percentageFormat = new DecimalFormat("0.00%");
    double winPercentage = (double) winCount / numberOfGamesToPlay;
    summary += "% Wins: " + percentageFormat.format(winPercentage) + "\n\n";

    System.out.println(summary);

    try {
      Files.writeString(logFile.toPath(), summary, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }
    catch(IOException ex) {
      System.out.println("Error writing to log file: " + ex.getMessage());
    }
  }
}