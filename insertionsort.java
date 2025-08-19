public class insertionsort {
        public static void insertionSort(int[] array) {
            for (int i = 1; i < array.length; i++) {
                int key = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] > key) {
                    array[j + 1] = array[j];
                    j = j - 1;
                }
                array[j + 1] = key;
            }
        }
        public static void printArray(int[] array) {
            for (int value : array) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        public static void main(String[] args) {
            int[] arr = { 12, 11, 13, 5, 6 };
            System.out.println("Original array:");
            printArray(arr);
            insertionSort(arr);
            System.out.println("Sorted array:");
            printArray(arr);
        }
    }