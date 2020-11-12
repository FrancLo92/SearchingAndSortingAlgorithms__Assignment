/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingAlgorithms;

import classes.Course;

/**
 *
 * @author HP Mini
 */
public class CourseSort {
    
    //COURSE SORTING ALGORITHMS
    
    //Bubble Sort is the simplest sorting algorithm that works by repeatedly 
    //swapping the adjacent elements if they are in wrong order.
    public static void bubbleSortCourse(Course[] arrayCourse)
       {
           System.out.println("\nBubble Sort Algorithm - Course ---------------");

           Course temp;

           for (int j = 0; j <= arrayCourse.length - 2; j++)
           {
               for (int i = 0; i <= arrayCourse.length - 2; i++)
               {
                   if (arrayCourse[i].CourseID > arrayCourse[i + 1].CourseID)
                   {
                       //swapping temp and arrayCourse[i]
                       temp = arrayCourse[i + 1];
                       arrayCourse[i + 1] = arrayCourse[i];
                       arrayCourse[i] = temp;
                   }
               }
           }
           for (Course course : arrayCourse)
           {
               System.out.println(course);
           }
       }
     
    // The selection sort algorithm sorts an array by repeatedly finding the 
    //minimum element from unsorted part and putting it at the beginning. 
    public static void selectionSortCourse(Course [] arrayCourse) 
    { 
        System.out.println("\nSelection Sort Algorithm - Course ---------------");
        int n = arrayCourse.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n - 1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min = i; 
            for (int j = i + 1; j < n; j++) 
                if (arrayCourse[j].CourseID < arrayCourse[min].CourseID) 
                    min = j; 
  
            // Swap the found minimum element with the first 
            // element 
            Course temp = arrayCourse[min]; 
            arrayCourse[min] = arrayCourse[i]; 
            arrayCourse[i] = temp; 
        } 
        
        for (Course course : arrayCourse)
            {
                System.out.println(course);
            }
    }
    
    //Insertion sort is a simple sorting algorithm that works similar to the 
    //way you sort playing cards in your hands. The array is virtually split 
    //into a sorted and an unsorted part. Values from the unsorted part are 
    //picked and placed at the correct position in the sorted part.
    public static void insertionSortCourse(Course [] arrayCourse, int n)  
    {  
        System.out.println("\nInsertion Sort Algorithm - Course ---------------");        
        int i, j;  
        Course key;
        for (i = 1; i < n; i++) 
        {  
            key = arrayCourse[i];  
            j = i - 1;  

            /* Move elements of arr[0..i-1], that are  
            greater than key, to one position ahead  
            of their current position */
            while (j >= 0 && arrayCourse[j].CourseID > key.CourseID) 
            {  
                arrayCourse[j + 1] = arrayCourse[j];  
                j = j - 1;  
            }  
            arrayCourse[j + 1] = key;  
        }  
        
        for (Course course : arrayCourse)
        {
            System.out.println(course);
        }
    }  
    
}
