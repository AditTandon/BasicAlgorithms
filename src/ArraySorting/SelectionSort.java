package ArraySorting;

/**
 *
 * Adit Tandon
 * Simple selection sort exercise to help me practice sorting an array
 */
public class SelectionSort {
    
    public static void main(String[] args) {
        
        int[] numbers = {4, 2, 3, 10, 1, 9, 20};
        
        printSortedArray(selectionSort(numbers));
    }
    
    //selection sort method
    public static int[] selectionSort(int[] numbers) {
            
        for (int i = 0; i < numbers.length - 1; i++) {
            int hold = i;
            
            for (int j = (i + 1); j < numbers.length; j++) {
                if (numbers[j] < numbers[hold]) {
                    hold = j;
                }
            }
             int swapSmaller = numbers[hold];
            numbers[hold] = numbers[i];
            numbers[i] = swapSmaller;
        }   
        return numbers;
    }
       
    public static void printSortedArray(int[] numbers) {
        for (int values : numbers) {
            System.out.print(values + ", ");
        }
    }
}
