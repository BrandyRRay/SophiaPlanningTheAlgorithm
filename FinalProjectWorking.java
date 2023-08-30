import java.util.Scanner;
//import java.util.ArrayList;
import java.io.IOException;
import java.util.InputMismatchException;

public class test {
  public static void main(String[] args)   {
    Scanner input = new Scanner(System.in);
    System.out.print("What is the ABO Type of the gestational parent?");
    System.out.println("Please enter one of the following choices: A, B, AB, or O: ");
    String aboParent1 = input.nextLine();
    aboParent1 = aboParent1.toUpperCase();
    System.out.println("Is the gestational parent Rh positive? Y/N: ");
    String rhParent1 = input.nextLine();
    rhParent1 = rhParent1.toUpperCase();
    
    System.out.print("What is the ABO Type of the non-gestational parent?");
    System.out.println("Please enter one of the following choices: A, B, AB, or O: ");
    String aboParent2 = input.nextLine();
    aboParent2 = aboParent2.toUpperCase();
    System.out.println("Is the non-gestational parent Rh positive? Y/N: ");
    String rhParent2 = input.nextLine();
    rhParent2 = rhParent2.toUpperCase();

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
    else {
      System.out.println("Error. Blood type unavailable at this time.");
    }


    if(rhParent1.equals("Y") && rhParent2.equals("Y")) {
      System.out.println("Your child will also be Rh positive. ");      
    }
    else if(rhParent1.equals("Y") && rhParent2.equals("N")) {
      System.out.println("Your child has a 93.75% chance of being Rh positive, and a 6.75% of being Rh negative. "); 
    }      
    else if(rhParent1.equals("N") && rhParent2.equals("N")) {
      System.out.println("Your child will also be Rh negative. ");  
    }    
    else if(rhParent1.equals("N") && rhParent2.equals("Y")) {
      System.out.println("Your child has a 93.75% chance of being Rh positive, and a 6.75% of being Rh negative. ");
      //Added \n to below WARNING for clearer printing
      System.out.print("********WARNING********");
      System.out.print("\nPlease note that the blood types entered indicate the possibility of an incompatibility issue that may require medical intervention.");
      System.out.print("\nIf you haven’t already, please discuss the issue of Rh incompatibility, or HDFN, with your Obstetrician at your next scheduled office visit or telehealth appointment.");
      System.out.println("\nFor more information on RH incompatibility, please visit https://familydoctor.org/rh-incompatibility");
    }
    else {
      System.out.println("Error. Rh type unavailable at this time.");
    }
  }
}