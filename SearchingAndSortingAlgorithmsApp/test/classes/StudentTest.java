/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

import org.junit.Test;
import static SearchAlgorithms.StudentSearch.binaryStudentSearch;
import static SearchAlgorithms.StudentSearch.linearStudentSearch;

import static SortingAlgorithms.StudentSort.bubbleSortStudent;
import static SortingAlgorithms.StudentSort.insertionSortStudent;
import static SortingAlgorithms.StudentSort.selectionSortStudent;
import org.junit.Assert;

/**
 *
 * @author HP Mini
 */
public class StudentTest {
    
    Student s1 = new Student("Jhon", "smith","1234567890", 1, "program2",new Date());        
    Student s2 = new Student("Jack", "smith","1234567890", 2, "program2",new Date());
    Student s3 = new Student("Frank", "White","1234567890", 3, "Program3",new Date());
    Student s4 = new Student("Joe", "Jones","1234567890", 4, "Program3",new Date());
    Student s5 = new Student("Vanessa", "William","1234567890", 5, "Program4",new Date());
    Student s6 = new Student("Dale", "Spaziani","1234567890", 6, "Program5",new Date());
    Student s7 = new Student("Luke", "Trump","1234567890", 7, "Program4",new Date());
    Student s8 = new Student("Uzma", "Bush","1234567890", 8, "Program5",new Date());
    Student s9 = new Student("Samara", "Lock","1234567890", 9, "Program7",new Date());
    Student s10 = new Student("Antonio", "Mansoor","1234567890", 10, "Program7",new Date());

    Student [] studentArray = {s10, s4, s3, s5, s8, s1, s2, s6, s9, s7};
    
    @Test
    public void testStudentBinarySearch() {
        Assert.assertEquals(3 , binaryStudentSearch(studentArray,s4));
    }
    
    @Test
    public void testStudentLinearSearch() {
        Assert.assertEquals(3 , linearStudentSearch(studentArray,s5));
    }
    
     @Test
    public void testEnrollmentBubbleSort() {
        Student[] Expected = {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
        bubbleSortStudent(studentArray);
        Assert.assertArrayEquals(Expected ,studentArray);
    }
    
    @Test
    public void testEnrollmentInsertionSort() {
        Student[] Expected = {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
        insertionSortStudent(studentArray, studentArray.length);
        Assert.assertArrayEquals(Expected ,studentArray);
    }
    
    @Test
    public void testEnrollmentSelectionSort() {
        Student[] Expected = {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
        selectionSortStudent(studentArray);
        Assert.assertArrayEquals(Expected ,studentArray);
    }
    
}
