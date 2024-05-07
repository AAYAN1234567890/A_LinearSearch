// E_InsertionSort.java

/*
 * Title: Selection Sort
 * Author: Aayan Samdani
 * Date: May 7, 2024
 */
public class E_InsertionSort {

    public static void insertionSort(int[] list) {
        int key;
        int j;
        for (int i = 1; i < list.length; i++) {
            key = list[i];
            j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
            C_BubbleSort.printArray(list);
        }
        
    }

    public static void main(String[] args) {
        int[] myList = {12, 11, 13 ,5,6, 200 , 94, 3, 75};
        insertionSort(myList);
        C_BubbleSort.printArray(myList);
    }

}