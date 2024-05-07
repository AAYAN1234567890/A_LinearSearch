// D_SelectionSort.java

/**
 * Title: Selection Sort
 * Author: Aayan Samdani
 * Date: May 7, 2024
 */

public class D_SelectionSort {

    public static void selectionSort(int[]list) {
        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[minIndex]) {
                    minIndex = j;
                }
            } // j end

            //Swapping values
            int temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }

    }

    public static void main(String[] args) {

        int myList[] = {64, 25, 12, 22, 11, 68, 200, 3};
        selectionSort(myList);
        C_BubbleSort.printArray(myList);

        

    }
}













