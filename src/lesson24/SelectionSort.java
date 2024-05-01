package lesson24;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            System.out.println("1st: " + minIndex);
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                    System.out.println("2nd: " + minIndex);
                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
                System.out.println("3rd: " + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 38, 12, 22, 11, 11};
        System.out.println("Original array:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("\nSorted array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
