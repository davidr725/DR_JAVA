import java.util.Scanner;
public class Ass1_P2 {
//This program calculates the important values of a resturant bill
    //values are: subtotal, tax,, tip, total
    
    public static void main(String[] args) {
        
        //defining double variables
        float subtotal, tax, tip, total;
        
        Scanner input = new Scanner(System.in);
        
        //ask the user what is the meal charge
        System.out.print("What is the meal charge? ");
        subtotal = input.nextFloat();
        
        tax = (float) (.0675 * subtotal);
        tip = (float) ((tax + subtotal) * .15);
        total = (float) (subtotal + tax + tip);
        
       //output the values
       System.out.println("Final bill:");
       System.out.println("Meal Charge: $" + subtotal); //print the meal charge
       System.out.println("Tax amount: $" + tax); //print tax
       System.out.println("Tip amount: $" + tip); //print tip
       System.out.println("Total bill: $" + total); //print total      
    }
    }
