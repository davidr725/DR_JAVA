
package ass1;
import java.util.Scanner;
public class Ass1_P1 {
// This program computes the sum, product and average based on the user's inputs
    
    
    public static void main(String[] args) {
        
        //defining double variables
        double first, second, third, sum, product, average;
        
        //create a scanner object to read the input
        Scanner input = new Scanner(System.in);
        
        //first input
        System.out.print("Enter first number: ");
        first = input.nextDouble();
        
        //second input
        System.out.print("Enter second number: ");
        second = input.nextDouble();
        
        //third input
        System.out.print("Enter third numnber: ");
        third = input.nextDouble();
        
       //define the sum, product, and average
       sum = first + second + third;
       product = first * second * third;
       average = (first + second + third)/3;
       
       //output the values
       System.out.println("Sum is " + sum);
       System.out.println("Product is " + product);
       System.out.println("Average is " + average);

       input.close();   
    }
     
}
