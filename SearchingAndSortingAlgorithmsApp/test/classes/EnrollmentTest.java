/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import static SearchAlgorithms.EnrollmentSearch.binaryEnrollmentSearch;
import static SearchAlgorithms.EnrollmentSearch.linearEnrollmentSearch;
import static SortingAlgorithms.EnrollmentSort.bubbleSortEnrollment;
import static SortingAlgorithms.EnrollmentSort.insertionSortEnrollment;
import static SortingAlgorithms.EnrollmentSort.selectionSortEnrollment;
import java.util.Date;

import org.junit.Assert;

import org.junit.Test;


/**
 *
 * @author HP Mini
 */
public class EnrollmentTest {
    
    Course c = new Course(1,"5SDA",21.50);
    
    Enrollment e1 = new Enrollment(1, new Date(),"D","S1",c);
    Enrollment e2 = new Enrollment(2, new Date(),"S","S2",c);
    Enrollment e3 = new Enrollment(3, new Date(),"D","S1",c);
    Enrollment e4 = new Enrollment(4, new Date(),"D","S1",c);
    Enrollment e5 = new Enrollment(5, new Date(),"S","S2",c);
    Enrollment e6 = new Enrollment(6, new Date(),"S","S2",c);
    Enrollment e7 = new Enrollment(7, new Date(),"D","S1",c);
    Enrollment e8 = new Enrollment(8, new Date(),"S","S2",c);
    Enrollment e9 = new Enrollment(9, new Date(),"D","S1",c);
    Enrollment e10 = new Enrollment(10, new Date(),"D","S2",c);
    
    Enrollment [] enrollmentArray = {e10, e4, e3, e5, e8, e1, e2, e6, e9, e7};
    
    @Test
    public void testEnrollmenttBinarySearch() {
        Assert.assertEquals(5 , binaryEnrollmentSearch(enrollmentArray,e6));
    }
    
    @Test
    public void testEnrollmentLinearSearch() {
        Assert.assertEquals(7 , linearEnrollmentSearch(enrollmentArray,e6));
    }
    
     @Test
    public void testEnrollmentBubbleSort() {
        Enrollment[] Expected = {e1,e2,e3,e4,e5,e6,e7,e8,e9,e10};
        bubbleSortEnrollment(enrollmentArray);
        Assert.assertArrayEquals(Expected ,enrollmentArray);
    }
    
    @Test
    public void testEnrollmentInsertionSort() {
        Enrollment[] Expected = {e1,e2,e3,e4,e5,e6,e7,e8,e9,e10};
        insertionSortEnrollment(enrollmentArray, enrollmentArray.length);
        Assert.assertArrayEquals(Expected ,enrollmentArray);
    }
    
    @Test
    public void testEnrollmentSelectionSort() {
        Enrollment[] Expected = {e1,e2,e3,e4,e5,e6,e7,e8,e9,e10};
        selectionSortEnrollment(enrollmentArray);
        Assert.assertArrayEquals(Expected ,enrollmentArray);
    }
    
}
