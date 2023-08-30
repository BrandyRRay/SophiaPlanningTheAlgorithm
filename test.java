import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;

public class test {
  public static void main(String[] args)   {
    //To be able to read what is entered into the console
    Scanner input = new Scanner(System.in);
    //Ask Mother to enter Blood Type A/B/AB/O
    System.out.print("What is the ABO Type of the gestational parent?");
    System.out.println("Please enter one of the following choices: A, B, AB, or O: ");
    //Assign the entered Maternal blood type to variable aboParent1
    String aboParent1 = input.nextLine();
    //Ensures that the data entered is Upper Case for comparison purposes
    aboParent1 = aboParent1.toUpperCase();
    //Ask Mother to signify Rh factor type, positive or negative
    System.out.println("Is the gestational parent Rh positive? Y/N: ");
    //Assign the entered Maternal Rh factor type to variable rhParent1
    String rhParent1 = input.nextLine();
    //Ensures that the data entered is Upper Case for comparison purposes
    rhParent1 = rhParent1.toUpperCase();

    //Ask Father to enter Blood Type A/B/AB/O
    System.out.print("What is the ABO Type of the non-gestational parent?");
    System.out.println("Please enter one of the following choices: A, B, AB, or O: ");
    //Assign the entered Paternal blood type to variable aboParent2
    String aboParent2 = input.nextLine();
    //Ensures that the data entered is Upper Case for comparison purposes
    aboParent2 = aboParent2.toUpperCase();
    //Ask Father to signify Rh factor type, positive or negative
    System.out.println("Is the non-gestational parent Rh positive? Y/N: ");
    //Assign the entered Paternal Rh factor type to variable rhParent2
    String rhParent2 = input.nextLine();
    //Ensures that the data entered is Upper Case for comparison purposes
    rhParent2 = rhParent2.toUpperCase();


    //Following if/else statement blocks take Maternal and Paternal blood types and use equals() and the logical && comparison to match given inputs to the correct Child blood type chance statements
    if(aboParent1.equals("A") && aboParent2.equals("A")) {
      System.out.print("Your child has the following blood type chances: ");
      System.out.println("93.75% Type A; 6.25% Type O. ");      
    }
    else if(aboParent1.equals("A") && aboParent2.equals("B")) {
      System.out.print("Your child has the following blood type chances: ");
      System.out.println("18.75% Type A; 18.75% Type B, 56.25% Type AB; 6.75% Type O. "); 
    }      
    else if(aboParent1.equals("A") && aboParent2.equals("AB")) {
      System.out.print("Your child has the following blood type chances: ");
      System.out.println("50% Type A; 12.5% Type B, 37.5% Type AB. "); 
    }    
    else if(aboParent1.equals("A") && aboParent2.equals("O")) {
      System.out.print("Your child has the following blood type chances: ");
      System.out.println("75% Type A; 25% Type O. "); 
    }   
    else if(aboParent1.equals("B") && aboParent2.equals("A")) {
      System.out.print("Your child has the following blood type chances: ");
      System.out.println("18.75% Type A; 18.75% Type B, 56.25% Type AB; 6.75% Type O. "); 
    }  
    else if(aboParent1.equals("B") && aboParent2.equals("B")) {
      System.out.print("Your child has the following blood type chances: ");
      System.out.println("93.75% Type B, 6.75% Type O. "); 
    }  
    else if(aboParent1.equals("B") && aboParent2.equals("AB")) {
      System.out.print("Your child has the following blood type chances: ");
      System.out.println("12.5% Type A; 50% Type B, 37.5% Type AB. "); 
    }      
    else if(aboParent1.equals("B") && aboParent2.equals("O")) {
      System.out.print("Your child has the following blood type chances: ");
      System.out.println("75% Type B; 25% Type O. "); 
    }      
    else if(aboParent1.equals("AB") && aboParent2.equals("A")) {
      System.out.print("Your child has the following blood type chances: ");
      System.out.println("50% Type A; 12.5% Type B, 37.5% Type AB. "); 
    }      
    else if(aboParent1.equals("AB") && aboParent2.equals("AB")) {
      System.out.print("Your child has the following blood type chances: ");
      System.out.println("12.5% Type A; 50% Type B, 37.5% Type AB. "); 
    }      
    else if(aboParent1.equals("AB") && aboParent2.equals("AB")) {
      System.out.print("Your child has the following blood type chances: ");
      System.out.println("25% Type A; 25% Type B, 50% Type AB. "); 
    }      
    else if(aboParent1.equals("AB") && aboParent2.equals("O")) {
      System.out.print("Your child has the following blood type chances: ");
      System.out.println("50% Type A; 50% Type B. "); 
    }      
    else if(aboParent1.equals("O") && aboParent2.equals("A")) {
      System.out.print("Your child has the following blood type chances: ");
      System.out.println("75% Type A; 25% Type O. "); 
    }      
    else if(aboParent1.equals("O") && aboParent2.equals("B")) {
      System.out.print("Your child has the following blood type chances: ");
      System.out.println("75% Type B; 25% Type O. "); 
    }      
    else if(aboParent1.equals("O") && aboParent2.equals("AB")) {
      System.out.print("Your child has the following blood type chances: ");
      System.out.println("50% Type A; 50% Type B. "); 
    }      
    else if(aboParent1.equals("O") && aboParent2.equals("O")) {
      System.out.print("Your child has the following blood type chances: ");
      System.out.println("100% Type O. "); 
    }
    else { //catch-all error statement produces error for any other entry type given
      System.out.println("Error. Blood type unavailable at this time.");
    }


    //Following if/else statement blocks take Maternal and Paternal Rh factor types and use equals() and the logical && comparison to match given inputs to the correct Child Rh type chance statements
    if(rhParent1.equals("Y") && rhParent2.equals("Y")) {
      System.out.println("Your child will also be Rh positive. ");      
    }
    else if(rhParent1.equals("Y") && rhParent2.equals("N")) {
      System.out.println("Your child has a 93.75% chance of being Rh positive, and a 6.75% of being Rh negative. "); 
    }      
    else if(rhParent1.equals("N") && rhParent2.equals("N")) {
      System.out.println("Your child will also be Rh negative. ");  
    } //Below entry, if generated, will also print Maternal WARNING statements
    else if(rhParent1.equals("N") && rhParent2.equals("Y")) {
      System.out.println("Your child has a 93.75% chance of being Rh positive, and a 6.75% of being Rh negative. ");
      System.out.print("********WARNING********");
      //Added \n to below WARNING for clearer statement printing
      System.out.print("\nPlease note that the blood types entered indicate the possibility of an incompatibility issue that may require medical intervention.");
      System.out.print("\nIf you haven’t already, please discuss the issue of Rh incompatibility, or HDFN, with your Obstetrician at your next scheduled office visit or telehealth appointment.");
      System.out.println("\nFor more information on RH incompatibility, please visit https://familydoctor.org/rh-incompatibility");
    }
    else { //catch-all error statement produces error for any other entry type given
      System.out.println("Error. Rh type unavailable at this time.");
    }
  }
}