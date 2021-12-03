/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savingsaccount;

import java.util.Scanner;
public class SavingsAccount {
    
    //fields
    private double interestrate, balance;
    
    //constructor
    public SavingsAccount(double startbal){
        balance = startbal;
    }
    
    //Methods
    public void setinterest(double rate){
        interestrate = rate;
    }
    
    public void deposit(double amt){
        balance += amt;
    }
    
    public void withdrawal(double amt){
        balance -= amt;
    }
    
    public void addinterest(){
        balance = balance + (balance*(interestrate/12));
    }
    
    public double getinterest(){
        return (balance*(interestrate/12));
    }
    
    public double getBalance(){
        return balance;
    }
    
    
    public static void main(String[] args) {
        
        
        //Getting inputs from user
        Scanner key = new Scanner(System.in);
        
        double interest_rate, starting_bal, time, amount;
        
        System.out.println("What is the annual interest rate? ");
        interest_rate = key.nextDouble();
        
        
        System.out.println("What is the starting balance? ");
        starting_bal = key.nextDouble();
        SavingsAccount account = new SavingsAccount(starting_bal);
        account.setinterest(interest_rate);
        
        System.out.println("How many months has the account been open? ");
        time = key.nextDouble();
        
        for (double i=1; i <= time; i++){ 
            System.out.println("In month " + i + " how much money did you deposit?");
            amount = key.nextDouble();  
            account.deposit(amount);
            System.out.println("In month " + i + " how much money did you withdraw?");
            amount = key.nextDouble();
            account.withdrawal(amount);
            account.addinterest();
            System.out.println("The monthly interest accumulated for month " + i + " is ");
            System.out.println(account.getinterest());
            System.out.println("The ending balance for month " + i + " is ");
            System.out.println(account.getBalance());
        }
        
        System.out.println("The ending balance after " + time + " months is: ");
        System.out.println(account.getBalance());
    }
    
}
