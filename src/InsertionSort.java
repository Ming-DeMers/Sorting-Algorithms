/**
 * A stable sorting alogorithm that has time complexity O(n^2) and space O(1).
 */
public class InsertionSort {


    public int[] insertionSort(int[] inputArray) {
        for(int i= 1; i < inputArray.length; i++) {
            int val= inputArray[i];
            int j= i-1;

            while (j >= 0 && inputArray[j] > val) {
                inputArray[j+1]= inputArray[j];
                j--;
            }
            inputArray[j+1]= val;
        }

        return inputArray;
    }
}
