/**
 * Title: Bubble Sort
 * Author: Aayan Samdani
 * Date: May 3, 2024
 */
  
 public class C_BubbleSort {

    public static void bubbleSort(int list[]) {
        int temp;
        boolean swapped;

        for (int i = 0; i < list.length; i++){
            swapped = false;
            for (int j = 0; j < list.length - i - 1; j++ ){
                if (list[j] > list[j + 1]) {
                    temp = list [j];
                    list[j] = list [j + 1];
                    list [j + 1] = temp;
                    swapped = true;
                }
            }
            //nothing swapped
            if (!swapped)
                break;
        }
    }

    public static void printArray(int print[]) {
        for (int i = 0; i < print.length;i++) {
            System.out.print(print[i] + " ");
        //System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] myList = {64, 3, 98, 876, 5, 35, 46, 987, 456, 1, 24, 75, 234, 76, 9, 13  };
        int n = myList.length;
        bubbleSort(myList);
        System.out.println("Sorted Array: ");
        printArray(myList);
        
        }
    
    }

 
