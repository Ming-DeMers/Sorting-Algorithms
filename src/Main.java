import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] numbers= createRandomArray(500, 999999999);

        System.out.println("Array Before:");
        printArray(numbers);

        numbers= quick(numbers);

        System.out.println("Array After:");
        printArray(numbers);
    }

    private static int[] insert(int[] numbers) {
        InsertionSort insert = new InsertionSort();
        insert.insertionSort(numbers);
        return numbers;
    }

    private static int[] merge(int[] numbers) {
        MergeSort sorty = new MergeSort();
        sorty.doMerge(numbers);
        return numbers;
    }

    private static int[] quick(int[] numbers) {
        QuickSort quicky = new QuickSort();
        System.out.println("Working on it");

        quicky.doQuickSort(numbers);
        return numbers;
    }

    private static int[] createRandomArray(int quantity, int range) {
        Random rand = new Random();
        int[] numbers = new int[quantity];
        for (int i= 0; i < numbers.length; i++) {
            numbers[i]= rand.nextInt(range);
        }

        return numbers;
    }

    private static void printArray(int[] numbers) {
        for (int i= 0; i<numbers.length; i++) {
            System.out.print("[" + numbers[i] + "], ");
        }
    }
}
