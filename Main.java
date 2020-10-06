import java.util.Scanner;

/**
 * prints *s
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new scanner for user input
    Scanner input = new Scanner(System.in);

    //ask user for a number and declare a variable to store it 
    System.out.println("Please enter a number between 1 and 10");
    int userNum = input.nextInt();

    //create a for loop and declare a variable to count the number of times the *s are printed on different lines
    for(int count = 1; count <= userNum; count++){

      //create a nested for loop and declare  variablee to count the number of *s on a single line
      for(int count2 = 2; count2 <= userNum; count2++){
       System.out.print("*");
     }
      System.out.println("*");
      
    }
    
  }
}
