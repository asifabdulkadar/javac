import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        System.out.print("Enter number to search: ");
        int key = sc.nextInt();
        
        int index = binarySearch(arr, key);
        if (index != -1) System.out.println("Element found at index: " + index);
        else System.out.println("Element not found.");
        
        sc.close();
    }
}
