
package assignment.pkg5;


import java.util.Scanner;

public class Assignment5 {



    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int workers = employees();
        int time = days(workers);
        double average = averagedays(workers, time);
        System.out.println(average);
    }
    public static int employees(){
        Scanner key1 = new Scanner(System.in);
        System.out.println("How many employees are in the company? ");
        int num = key1.nextInt();
        return num;
    }
    public static int days(int employees0){
        Scanner key2 = new Scanner(System.in);
        int sumofdays = 0;
        for (int i=1; i <= employees0; i++){
            System.out.println("How many days did employee " + i + " miss? ");
            int days = key2.nextInt();
            sumofdays = sumofdays + days;
        }
        return sumofdays;
    }
    public static double averagedays(double employees1, double days0){
        
        double average = days0/employees1;
        return average;

    }
        
    }