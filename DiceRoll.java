import java.util.Random; 

public class DiceRoll {
  //The values of the 2 dice (an array of int)
  private final int[] die = new int[2];
  //Attribute to hold the sum of the dice
  private int sum;
  //Attribute for random number generator instance
  private Random randomNumberGenerator;

  public DiceRoll() {
    //Create the random number generator
    randomNumberGenerator = new Random();
    //Get the random number for 1st die in range from 1 to 6 & store in array
    die[0] = randomNumberGenerator.nextInt(6) + 1;
    //Get the random number for the 2nd die in range from 1 to 6 & store in array
    die[1] = randomNumberGenerator.nextInt(6) + 1;
    //Add values of dice and store
    sum = die[0] + die[1];
  }

  //Accessor method to get sum of dice 
  public int getSum() {
    return sum;
  }

  //String representation of the dice roll 
  public String toString() {
    return "Dice: " + die[0] + " " + die[1] + " Sum = " + sum;
  }
}