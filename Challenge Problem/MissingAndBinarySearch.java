import java.util.Arrays;
import java.util.Scanner;

public class MissingAndBinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: List of integers
        System.out.println("Enter the number of elements in the list:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the first missing positive integer using Linear Search
        int missingNumber = findFirstMissingPositive(arr);
        System.out.println("First missing positive integer: " + missingNumber);

        // Sorting the array for binary search
        Arrays.sort(arr);

        // Input: Target number for Binary Search
        System.out.println("Enter the target number for Binary Search:");
        int target = scanner.nextInt();

        // Find index of target using Binary Search
        int targetIndex = binarySearch(arr, target);
        System.out.println("Index of target element: " + targetIndex);

        scanner.close();
    }

    // Function to find the first missing positive integer using Linear Search
    private static int findFirstMissingPositive(int[] arr) {
        int n = arr.length;

        // Step 1: Place each number in its correct position if possible
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                swap(arr, i, arr[i] - 1);
            }
        }

        // Step 2: Find the first missing positive integer
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        // If all numbers from 1 to n are present, return n+1
        return n + 1;
    }

    // Swap function to help rearrange elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to perform Binary Search
    private static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found, return index
            } else if (arr[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }
        return -1; // Target not found
    }
}
