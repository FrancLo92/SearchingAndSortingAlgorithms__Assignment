/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchAlgorithms;

import classes.Student;
import java.util.Arrays;

/**
 *
 * @author HP Mini
 */
public class StudentSearch {
    
    
    //The linear search algoritms starts from the leftmost element of arr[]
    //and one by one compare the earched item with each element of arr[]
    //If the searched item matches with an array item, return the index.
    //If the searched item doesn’t match with any of elements, return -1.
     public static int linearStudentSearch(Student[] arraystudent, Student student)
    {
        System.out.println("\n\n\nLinear Student search---------------");
        for (int i =0;i<arraystudent.length;i++)
        {
            if (arraystudent[i] == student)
            {
                System.out.println("\n\nStudent: " + student.toString() + "\nhas been found at position: " + i + " in the student array.");
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
    public static int binaryStudentSearch(Student[] arraystudent , Student student)
    {
        System.out.println("\nBinary Student search---------------");                  
        int min = 0;
        int n = arraystudent.length;
        int max = n - 1;

        Arrays.sort(arraystudent);
        System.out.println("\nStudent array has been sorted by ID to perform binary search\n");
        for (int i = 0; i < arraystudent.length; i++)
        {
            System.out.println("Student array position " + i + " " + arraystudent[i]);
        }

        do
        {
            int mid = (min + max) / 2;
            if (student.StudentID > arraystudent[mid].StudentID)
                min = mid + 1;
            else
                max = mid - 1;

            if (arraystudent[mid].StudentID == student.StudentID)
            {
                System.out.println("\n\nStudent: " + student + "\nhas been found at position: " + mid + " in the student array.");
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
