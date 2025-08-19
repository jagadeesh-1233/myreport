import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements:"+n);
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("Enter the element to be deleted:");
        int deleted = sc.nextInt();
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == deleted) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Element not found in the array.");
        } else{
            for (int i = index; i < n - 1; i++) {
                a[i] = a[i + 1];
            }
            n--;
            System.out.println("Array elements after the deletion are:");
            for (int i = 0; i < n;i++) {
                System.out.print(a[i] + " ");
            }
        }
        sc.close();
    }
}

