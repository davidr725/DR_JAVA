
package ass2_p1;

import java.util.Scanner;
        
public class Ass2_P1 {


    public static void main(String[] args) {
    
    double sales, commission;
    Scanner input = new Scanner(System.in);
    
    System.out.println("What was your monthly sales? ");
    sales = input.nextDouble();
    
    if (sales < 10000)
        commission = 225 + (.03*sales);        
    else if (sales < 20000)
        commission = 250 + (.04*sales);
    else if (sales < 30000)
        commission = 275 + (.05*sales);
    else if (sales < 40000)
        commission = 300 + (.06*sales);
    else if (sales < 50000)
        commission = 350 + (.08*sales); 
    else
        commission = 400 + (.10*sales);
        
    
    System.out.println("Your monthly income is " + commission);
            
    
            
    }
    
}
