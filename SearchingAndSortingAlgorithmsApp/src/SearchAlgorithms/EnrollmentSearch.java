/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchAlgorithms;

import classes.Enrollment;
import java.util.Arrays;

/**
 *
 * @author HP Mini
 */
public class EnrollmentSearch {
    
     //ENROLLMENT SEARCH ALGORITHMS
    //The linear search algoritms starts from the leftmost element of arr[]
    //and one by one compare the earched item with each element of arr[]
    //If the searched item matches with an array item, return the index.
    //If the searched item doesn’t match with any of elements, return -1.
    public static int linearEnrollmentSearch(Enrollment[] arrayenrollment, Enrollment enrollment)
    {
        System.out.println("\n\n\nLinear Enrollment search---------------");
        for (int i =0;i<arrayenrollment.length;i++)
        {
            if (arrayenrollment[i] == enrollment)
            {
                System.out.println("\n\nEnrollment: " + enrollment.toString() + "\nhas been found at position: " + i + " in the enrollment array.");
                return i;
            }           
        }
        return -1;
    }

    //Binary search algorithm searches an item in a sorted array by repeatedly dividing the search
    //interval in half. Begin with an interval covering the whole array. If the value of the search
    //is less than the item in the middle of the interval, it narrows the interval
    //to the lower half. Otherwise it narrows it to the upper half. Repeatedly check 
    //until the value is found or the interval is empty.
    public static int binaryEnrollmentSearch(Enrollment[] arrayenrollment , Enrollment enrollment)
    {
        System.out.println("\nBinary enrollment search---------------");                  
        int min = 0;
        int n = arrayenrollment.length;
        int max = n - 1;

        Arrays.sort(arrayenrollment);
        System.out.println("\nEnrollment array has been sorted by ID to perform binary search\n");
        for (int i = 0; i < arrayenrollment.length; i++)
        {
            System.out.println("Enrollment array position " + i + " " + arrayenrollment[i]);
        }

        do
        {
            int mid = (min + max) / 2;
            if (enrollment.EnrollmentID > arrayenrollment[mid].EnrollmentID)
                min = mid + 1;
            else
                max = mid - 1;

            if (arrayenrollment[mid].EnrollmentID == enrollment.EnrollmentID)
            {
                System.out.println("\n\nEnrollment: " + enrollment + "\nhas been found at position: " + mid + " in the enrollment array.");
                return mid;
            }
            if (min > max)
            {
                break;
            }

        } while (min <= max);

        return -1;
    }
    
}
