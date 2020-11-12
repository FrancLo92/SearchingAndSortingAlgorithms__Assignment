/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingAlgorithms;

import classes.Student;

/**
 *
 * @author HP Mini
 */
public class StudentSort {
    
    //ENROLLMENT SORTING ALGORITHMS
    
    //Bubble Sort is the simplest sorting algorithm that works by repeatedly 
    //swapping the adjacent elements if they are in wrong order.
    public static void bubbleSortStudent(Student[] arrayStudent)
       {
           System.out.println("\nBubble Sort Algorithm - Student ---------------");

           Student temp;

           for (int j = 0; j <= arrayStudent.length - 2; j++)
           {
               for (int i = 0; i <= arrayStudent.length - 2; i++)
               {
                   if (arrayStudent[i].StudentID > arrayStudent[i + 1].StudentID)
                   {
                       //swapping temp and arrayCourse[i]
                       temp = arrayStudent[i + 1];
                       arrayStudent[i + 1] = arrayStudent[i];
                       arrayStudent[i] = temp;
                   }
               }
           }
           for (Student s : arrayStudent)
           {
               System.out.println(s);
           }
       }
     
    // The selection sort algorithm sorts an array by repeatedly finding the 
    //minimum element from unsorted part and putting it at the beginning. 
    public static void selectionSortStudent(Student [] arrayStudent) 
    { 
        System.out.println("\nSelection Sort Algorithm - Student ---------------");
        int n = arrayStudent.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n - 1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min = i; 
            for (int j = i + 1; j < n; j++) 
                if (arrayStudent[j].StudentID < arrayStudent[min].StudentID) 
                    min = j; 
  
            // Swap the found minimum element with the first 
            // element 
            Student temp = arrayStudent[min]; 
            arrayStudent[min] = arrayStudent[i]; 
            arrayStudent[i] = temp; 
        } 
        
        for (Student s : arrayStudent)
            {
                 System.out.println(s);
            }
    }
    
    //Insertion sort is a simple sorting algorithm that works similar to the 
    //way you sort playing cards in your hands. The array is virtually split 
    //into a sorted and an unsorted part. Values from the unsorted part are 
    //picked and placed at the correct position in the sorted part.
    public static void insertionSortStudent(Student [] arrayStudent, int n)  
    {  
        System.out.println("\nInsertion Sort Algorithm - Student ---------------");        
        int i, j;  
        Student key;
        for (i = 1; i < n; i++) 
        {  
            key = arrayStudent[i];  
            j = i - 1;  

            /* Move elements of arr[0..i-1], that are  
            greater than key, to one position ahead  
            of their current position */
            while (j >= 0 && arrayStudent[j].StudentID > key.StudentID) 
            {  
                arrayStudent[j + 1] = arrayStudent[j];  
                j = j - 1;  
            }  
            arrayStudent[j + 1] = key;  
        }  
        
        for (Student s : arrayStudent)
        {
            System.out.println(s);
        }
    }  
    
}
