/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import static SearchAlgorithms.CourseSearch.binaryCourseSearch;
import static SearchAlgorithms.CourseSearch.linearCourseSearch;
import static SortingAlgorithms.CourseSort.bubbleSortCourse;
import static SortingAlgorithms.CourseSort.insertionSortCourse;
import static SortingAlgorithms.CourseSort.selectionSortCourse;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author HP Mini
 */
public class CourseTest {
    
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
    
    Course [] courseArray = {c10, c4, c3, c5, c8, c1, c2, c6, c9, c7};
    
    
    @Test
    public void testCourseBinarySearch() {
        Assert.assertEquals(9 , binaryCourseSearch(courseArray,c10));
    }
    
    @Test
    public void testCourseLinearSearch() {
        Assert.assertEquals(0 , linearCourseSearch(courseArray,c10));
    }
    
    @Test
    public void testCourseBubbleSort() {
        Course[] Expected = {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10};
        bubbleSortCourse(courseArray);
        Assert.assertArrayEquals(Expected ,courseArray);
    }
    
    @Test
    public void testCourseInsertionSort() {
        Course[] Expected = {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10};
        insertionSortCourse(courseArray, courseArray.length);
        Assert.assertArrayEquals(Expected ,courseArray);
    }
    
    @Test
    public void testCourseSelectionSort() {
        Course[] Expected = {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10};
        selectionSortCourse(courseArray);
        Assert.assertArrayEquals(Expected ,courseArray);
    }

    
    
    
}
