import java.util.Scanner;
    public class bubblesort {
        public static void main(String[] args) {
            int[] arr = {2, 3, 4, 5, 9, 6, 4, 7};
            int n = arr.length;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the index of the array:");
            int index = sc.nextInt();
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            System.out.println("Sorted array:");
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
            if (index >= 0 && index < n) {
                System.out.println("Element at index " + index + " is: " + arr[index]);
            } else {
                System.out.println("Invalid index entered.");
            }
            sc.close();
        }
    }
