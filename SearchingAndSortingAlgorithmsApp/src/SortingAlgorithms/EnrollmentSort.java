/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingAlgorithms;

import classes.Enrollment;

/**
 *
 * @author HP Mini
 */
public class EnrollmentSort {
    
    //ENROLLMENT SORTING ALGORITHMS
    
    //Bubble Sort is the simplest sorting algorithm that works by repeatedly 
    //swapping the adjacent elements if they are in wrong order.
    public static void bubbleSortEnrollment(Enrollment[] arrayEnrollment)
       {
           System.out.println("\nBubble Sort Algorithm - Enrollment ---------------");

           Enrollment temp;

           for (int j = 0; j <= arrayEnrollment.length - 2; j++)
           {
               for (int i = 0; i <= arrayEnrollment.length - 2; i++)
               {
                   if (arrayEnrollment[i].EnrollmentID > arrayEnrollment[i + 1].EnrollmentID)
                   {
                       //swapping temp and arrayCourse[i]
                       temp = arrayEnrollment[i + 1];
                       arrayEnrollment[i + 1] = arrayEnrollment[i];
                       arrayEnrollment[i] = temp;
                   }
               }
           }
           for (Enrollment e : arrayEnrollment)
           {
               System.out.println(e);
           }
       }
     
    // The selection sort algorithm sorts an array by repeatedly finding the 
    //minimum element from unsorted part and putting it at the beginning. 
    public static void selectionSortEnrollment(Enrollment [] arrayEnrollment) 
    { 
        System.out.println("\nSelection Sort Algorithm - Enrollment ---------------");
        int n = arrayEnrollment.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n - 1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min = i; 
            for (int j = i + 1; j < n; j++) 
                if (arrayEnrollment[j].EnrollmentID < arrayEnrollment[min].EnrollmentID) 
                    min = j; 
  
            // Swap the found minimum element with the first 
            // element 
            Enrollment temp = arrayEnrollment[min]; 
            arrayEnrollment[min] = arrayEnrollment[i]; 
            arrayEnrollment[i] = temp; 
        } 
        
        for (Enrollment e : arrayEnrollment)
            {
                System.out.println(e);
            }
    }
    
    //Insertion sort is a simple sorting algorithm that works similar to the 
    //way you sort playing cards in your hands. The array is virtually split 
    //into a sorted and an unsorted part. Values from the unsorted part are 
    //picked and placed at the correct position in the sorted part.
    public static void insertionSortEnrollment(Enrollment [] arrayEnrollment, int n)  
    {  
        System.out.println("\nInsertion Sort Algorithm - Enrollment ---------------");        
        int i, j;  
        Enrollment key;
        for (i = 1; i < n; i++) 
        {  
            key = arrayEnrollment[i];  
            j = i - 1;  

            /* Move elements of arr[0..i-1], that are  
            greater than key, to one position ahead  
            of their current position */
            while (j >= 0 && arrayEnrollment[j].EnrollmentID > key.EnrollmentID) 
            {  
                arrayEnrollment[j + 1] = arrayEnrollment[j];  
                j = j - 1;  
            }  
            arrayEnrollment[j + 1] = key;  
        }  
        
        for (Enrollment e : arrayEnrollment)
        {
            System.out.println(e);
        }
    }  
    
}
