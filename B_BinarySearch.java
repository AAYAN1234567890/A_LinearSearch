/**
 * Title: Binary Search
 * Author: Aayan Samdani
 * Date: May 2, 2024
 */

 import java.util.*;

 //  import java.util.Random;
 // import java.util.ArrayList;
 // import java.util.Arrays;
 // import java.util.Collections;
  
 public class B_BinarySearch {
 
     public static Boolean binarySearch(ArrayList<Integer> list, int value) {
         int start = 0;
         int end = list.size()-1;
         int midpoint;
 
         while (start <= end) {
             midpoint = (start+end)/2;
             //System.out.println(list.get(midpoint));
             if (list.get(midpoint) == value) {
                 return true;
             } else if (value > list.get(midpoint)) {
                 start = midpoint +1;
             } else {
                 end = midpoint -1;}
         }
     
     return false;
 }
     public static void main(String[] args) {
         // ArrayList<Integer> myList = new ArrayList<Integer>(Arrays.asList(4, 70, 100, 234, 356, 456, 700, 800, 989, 7895, 10000, 999999));
         // binarySearch(myList, 800);
 
         Random rand = new Random();
         ArrayList<Integer> numbers = new ArrayList<Integer>();
         
         for (int i = 0; i < 10000000; i++){
             if (rand.nextInt(2) == 1){
                 numbers.add(i);
             }
         }
 
         int runs = 30;
         double[] times = new double[runs];
         double startTime;
         double endTime;
         double totalTime;
 
         System.out.println(numbers.size());
         Boolean test;
 
         for (int i = 0; i < runs; i++) {
             startTime = System.nanoTime();
 
             int target = numbers.get(rand.nextInt(numbers.size()));
 
             //REPLACE THE J FOR LOOP WITH THIS LINE
             test = binarySearch(numbers, target);
             
             endTime = System.nanoTime();
             totalTime = endTime - startTime;
             times[i] = totalTime;
         }
         double average = 0;
         for (int i = 0; i < times.length; i++) {
             System.out.println(times[i]);
             average += times[i];
         }
         average = average/times.length;
         System.out.println("Average Time: " + average);
     }
     
 }
 