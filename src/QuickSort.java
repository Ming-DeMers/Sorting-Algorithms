/**
 * An unstable sorting alogorithm of avg time complexity O(n log n) and worse time complexity O(n^2) <br>
 * Utilizes a pivot, sorting all the elements left and right, then recursively calls quick sort <br>
 * on the sorted arrays on the left and right of the pivot.
 */
public class QuickSort {

    /**
     * Public to sort a given array with quick sort
     *
     */
    public int[] doQuickSort(int[] numbers){
        quickSort(numbers, 0, numbers.length-1);
        return numbers;
    }

    /**
     * Recursive implementation of the quick sort algo.
     *
     */
    private void quickSort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) return; //basecase

        int pivot = array[highIndex];
        int lp= lowIndex;
        int rp= highIndex;

        while (lp < rp) {
            while (array[lp] <= pivot && lp < rp) {
                lp++ ;
            }
            while (array[rp] >= pivot && rp > lp){
                rp-- ;
            }
            swap(array, lp, rp);
        }

        swap(array, lp, highIndex);

        quickSort(array, lowIndex, lp-1);
        quickSort(array, lp+1, highIndex);
    }

    private void swap (int[] array, int index1, int index2) {
        int temp= array[index1];
        array[index1]= array[index2];
        array[index2]= temp;
    }


}
