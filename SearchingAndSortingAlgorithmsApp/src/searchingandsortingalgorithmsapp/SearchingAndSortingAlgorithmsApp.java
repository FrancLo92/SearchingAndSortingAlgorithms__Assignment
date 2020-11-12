/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchingandsortingalgorithmsapp;

import static SortingAlgorithms.CourseSort.bubbleSortCourse;
import static SortingAlgorithms.CourseSort.insertionSortCourse;
import static SortingAlgorithms.CourseSort.selectionSortCourse;
import classes.Course;
import classes.Enrollment;
import classes.Student;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;


/**
 *
 * @author HP Mini
 */
public class SearchingAndSortingAlgorithmsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Course c1 = new Course(1,"5SDA",21.50);
    Course c2 = new Course(2,"5JAW",8.50);
    Course c3 = new Course(3,"5SDA",9.50);
    Course c4 = new Course(4,"5TST",16.50);
    Course c5 = new Course(5,"5DD",50.50);
    Course c6 = new Course(6,"5CSW",100.50);
    Course c7 = new Course(7,"4JAB",200.50);
    Course c8 = new Course(8,"5MITP",150.50);
    Course c9 = new Course(9,"6CLP",30.50);
    Course c10 = new Course(10,"5TSD",45.50);
    
    Course [] courseList = {c10, c4, c3, c5, c8, c1, c2, c6, c9, c7};
    
    for(Course c : courseList){
        System.out.println(c);
    }
        System.out.println("After Sorting");
    //bubbleSortCourse(courseList);
    
    //selectionSortCourse(courseList);
    
    insertionSortCourse(courseList,courseList.length);
        
    }
    
    
}
