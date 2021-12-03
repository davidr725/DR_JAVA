
package ass1_p3;

import java.util.Scanner;
public class Ass1_P3 {

    
    public static void main(String[] args) {
    
    //Crreating a Scanner object
    Scanner input = new Scanner(System.in);
    
    //define variables
    String city, upper, lower;
    char letter;
    int stringSize;
    
    //Ask the user of the input
    System.out.print("What is the name of your Favorite City? ");
    city = input.next();
    
    //map the variables
    stringSize = city.length();
    upper = city.toUpperCase();
    lower = city.toLowerCase();
    letter = city.charAt(2);
              
    //Print the outputs
    System.out.println(stringSize);
    System.out.println(upper);
    System.out.println(lower);
    System.out.println(letter);
            
    
    
    }
    
}
