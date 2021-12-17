import java.util.Random;

/**
 * A stable sorting algorith of time complexity O(n logn) and space complexity O(n). <br>
 * It step-partitions a given array into smaller arrays of 2, sorts the subarrays, <br>
 * then reinserts them into a sorted array.
 */
public class MergeSort {

    /**
     * Public method to sort a given array with merge sort.
     * @param numbers
     * @return
     */
    public int[] doMerge(int[] numbers) {

        mergeSort(numbers);
        return numbers;
    }

    /**
     * Recursive implementation of the merge sort alogrithm.
     * Recursively splits an array into a left and right array
     * until there are only two elements.
     * Then, puts the elements back in sorted order.
     * @param inputArray
     */
    private void mergeSort(int[] inputArray) {
        int inputLength= inputArray.length;

        if(inputLength < 2) return;

        int midIndex= inputLength/2;
        int[] lefty= new int[midIndex];
        int[] righty= new int[inputLength-midIndex];

        for (int i= 0; i<midIndex; i++){
            lefty[i]= inputArray[i];
        }

        for (int i= midIndex; i < inputLength; i++) {
            righty[i-midIndex]= inputArray[i];
        }

        mergeSort(righty); mergeSort(lefty);

        merge(inputArray, lefty, righty);


    }

    /**
     * Given two arrays, lefty and righty, place the elements back into the
     * inputArray in sorted order.
     * @param inputArray
     * @param lefty
     * @param righty
     */
    private void merge(int[] inputArray, int[] lefty, int[] righty) {
        int leftSize= lefty.length;
        int rightSize= righty.length;

        int i= 0, j= 0, k= 0;

        while (i<leftSize && j<rightSize) {
            if (lefty[i] <= righty[i]) {
                inputArray[k]= lefty[i];
                i++;
            } else {
                inputArray[k]= righty[i];
                j++;
            }
            k++;
        }
        while (i<leftSize) {
            inputArray[k]= lefty[i];
            i++; k++;
        }

        while (j< rightSize) {
            inputArray[k]= righty[j];
            j++; k++;
        }

    }



}
