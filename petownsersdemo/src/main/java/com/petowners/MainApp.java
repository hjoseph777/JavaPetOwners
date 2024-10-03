package com.petowners;
import java.util.Scanner;

public class MainApp 
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students in the class own a pet?: ");
        int numberOfPetOwners = scanner.nextInt();
        System.out.print("How many students in the class do not own a pet?: ");
        int numberOfNonPetOwners = scanner.nextInt();

        float totalStudents = Statistics.calculateTotalStudents(numberOfPetOwners, numberOfNonPetOwners);
        float petOwnersPercentage = Statistics.calculatePetOwnersPercentage(numberOfPetOwners, totalStudents);
        float nonPetOwnersPercentage = Statistics.calculateNonPetOwnersPercentage(numberOfNonPetOwners, totalStudents);
         
        System.out.println("Total number of students: " + totalStudents);
        System.out.println("Percentage of pet owners: " + petOwnersPercentage + "%");
        System.out.println("Percentage of non-pet owners: " + nonPetOwnersPercentage + "%");

        scanner.close();

        
    }
}
