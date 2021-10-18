package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        Sort sort = new Sort();

        try {
            int [] actual = sort.selectionSort(unSortedArray);
            Assert.assertEquals(actual,sortedArray);
            System.out.println("Selection Sort Unit Test Passed");
        }catch(AssertionError ex){
            System.out.println("Selection Sort Unit Test Failed");
        }


        try {
            int [] actual = sort.insertionSort(unSortedArray);
            Assert.assertEquals(actual,sortedArray);
            System.out.println("Insertion Sort Unit Test Passed");
        }catch(AssertionError ex){
            System.out.println("Insertion Sort Unit Test Failed");
        }


        try {
            int [] actual = sort.bubbleSort(unSortedArray);
            Assert.assertEquals(actual,sortedArray);
            System.out.println("Bubble Sort Unit Test Passed");
        }catch(AssertionError ex){
            System.out.println("Bubble Sort Unit Test Failed");
        }


        try {
            int [] actual = sort.mergeSort(unSortedArray);
            Assert.assertEquals(actual,sortedArray);
            System.out.println("Merge Sort Unit Test Passed");
        }catch(AssertionError ex){
            System.out.println("Merge Sort Unit Test Failed");
        }

        try {
            int [] actual = sort.quickSort(unSortedArray);
            Assert.assertEquals(actual,sortedArray);
            System.out.println("Quick Sort Unit Test Passed");
        }catch(AssertionError ex){
            System.out.println("Quick Sort Unit Test Failed");
        }


        try {
            int [] actual = sort.heapSort(unSortedArray);
            Assert.assertEquals(actual,sortedArray);
            System.out.println("Heap Sort Unit Test Passed");
        }catch(AssertionError ex){
            System.out.println("Heap Sort Unit Test Failed");
        }


        try {
            int [] actual = sort.bucketSort(unSortedArray);
            Assert.assertEquals(actual,sortedArray);
            System.out.println("Bucket Sort Unit Test Passed");
        }catch(AssertionError ex){
            System.out.println("Bucket Sort Unit Test Failed");
        }


        try {
            int [] actual = sort.shellSort(unSortedArray);
            Assert.assertEquals(actual,sortedArray);
            System.out.println("Shell Sort Unit Test Passed");
        }catch(AssertionError ex){
            System.out.println("Shell Sort Unit Test Failed");
        }
    }
}