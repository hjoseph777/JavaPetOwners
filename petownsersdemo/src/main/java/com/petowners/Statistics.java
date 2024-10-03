package com.petowners;

public class Statistics {

 // Method to calculate the total number of students
 public static float calculateTotalStudents(int numberOfPetOwners, int numberOfNonPetOwners) {
    return numberOfPetOwners + numberOfNonPetOwners;
}

 // Method to calculate the percentage of pet owners
public static float calculatePetOwnersPercentage(int numberOfPetOwners, float totalStudents) {
    return (totalStudents > 0) ? Math.round((numberOfPetOwners / totalStudents) * 10000) / 100.0f : 0;
}

// Method to calculate the percentage of non-pet owners
public static float calculateNonPetOwnersPercentage(int numberOfNonPetOwners, float totalStudents) {
    return (totalStudents > 0) ? Math.round((numberOfNonPetOwners / totalStudents) * 10000) / 100.0f : 0;
}
    
}
