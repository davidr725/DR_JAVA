
package ass2_p2;

import java.util.Scanner;

        
public class Ass2_P2 {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int Custid, super_savings_plan;
        double Last_water, New_water, ser_fee, ssp_fee, water_used, rate, total_water, subtotal, total_bill;
        
        System.out.println("What is your Customer ID? ");
        Custid = input.nextInt();
        
        System.out.println("What was you last water meter reading? ");
        Last_water = input.nextDouble();
        
        System.out.println("What is your new water meter reading? ");
        New_water = input.nextDouble();
        
        System.out.println("Are you a Super Savings Plan member?"
                + " Use 1 for yes, 0 for no");
        super_savings_plan = input.nextInt();
        
        water_used = New_water - Last_water;
        ser_fee = 8.00;
        
        if (water_used < 200)
            rate = .08;
        else if (water_used < 800)
            rate = .07;
        else
            rate = .05;
        
        total_water = rate * water_used;
        
        if (super_savings_plan == 0)
            ssp_fee = 0;
        else
            ssp_fee = 6.00;
        
        subtotal = (total_water + ssp_fee + ser_fee);
        
        if (subtotal > 35)
            if(super_savings_plan ==1)
                subtotal = subtotal*(.8);

        total_bill = subtotal + (.06 * subtotal);
        
        System.out.println("Customer ID: " + Custid);
        if (super_savings_plan ==1)
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println("Previous Reading: " + Last_water);
        System.out.println("New Reading: " + New_water);
        System.out.println("Tax " + (.06*subtotal));
        System.out.println("Amount due: " + total_bill);
                
        
        
                
                
                    
        
            
            
                    
            
                    
        
         
        
        
            
        
        
        
    }
    
}
