/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchAlgorithms;

import classes.Course;
import classes.Enrollment;
import java.util.Arrays;

/**
 *
 * @author HP Mini
 */
public class CourseSearch {
    
    //COURSE SEARCH ALGORITHMS
    //The linear search algoritms starts from the leftmost element of arr[]
    //and one by one compare the earched item with each element of arr[]
    //If the searched item matches with an array item, return the index.
    //If the searched item doesn’t match with any of elements, return -1.
    public static int linearCourseSearch(Course[] arraycourse, Course course)
    {
        System.out.println("\n\n\nLinear Course search---------------");
        for (int i =0;i<arraycourse.length;i++)
        {
            if (arraycourse[i] == course)
            {
                System.out.println("\n\nCourse: " + course.toString() + "\nhas been found at position: " + i + " in the course array.");
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
    public static int binaryCourseSearch(Course[] arraycourse , Course course)
    {
        System.out.println("\nBinary enrollment search---------------");                  
        int min = 0;
        int n = arraycourse.length;
        int max = n - 1;

        Arrays.sort(arraycourse);
        System.out.println("\nEnrollment array has been sorted by ID to perform binary search\n");
        for (int i = 0; i < arraycourse.length; i++)
        {
            System.out.println("Enrollment array position " + i + " " + arraycourse[i]);
        }

        do
        {
            int mid = (min + max) / 2;
            if (course.CourseID > arraycourse[mid].CourseID)
                min = mid + 1;
            else
                max = mid - 1;

            if (arraycourse[mid].CourseID == course.CourseID)
            {
                System.out.println("\n\nCourse: " + course + "\nhas been found at position: " + mid + " in the course array.");
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
