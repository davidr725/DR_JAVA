/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

public class Assignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        double floors, rooms, occupied, vacant, total_rooms = 0, total_occupied = 0, total_vacant = 0;
        double vacancy;
        
        System.out.println("How many floors are in the hotel? ");
        floors = key.nextInt();
        
        for (double i=1; i <= floors; i++){
            rooms = 0;
            occupied = 0;
            vacant = 0;
            System.out.println("Floor " + i);
            System.out.println("How many rooms on this floor?");
            rooms = key.nextInt();
            System.out.println("How many rooms are occupied?");
            occupied = key.nextInt();
            vacant = rooms - occupied;
            total_rooms = total_rooms + rooms;
            total_occupied = total_occupied + occupied;
            total_vacant = total_vacant + vacant;
        }
        System.out.println("The total number of rooms: " + total_rooms);
        System.out.println("The total number of vacant rooms: " + total_vacant);
        System.out.println("The total number of occupied rooms: " + total_occupied);
        
        vacancy = (total_vacant/total_rooms);
        System.out.println("Vacancy percentage: " + vacancy);
    }
    
}
