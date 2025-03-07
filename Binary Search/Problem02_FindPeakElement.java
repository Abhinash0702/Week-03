import java.util.Scanner;

public class Problem02_FindPeakElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Array size
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Input: Array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Finding a peak element index
        int peakIndex = findPeakElement(arr);

        // Output: Peak element index and value
        System.out.println("Peak element found at index: " + peakIndex);
        System.out.println("Peak element value: " + arr[peakIndex]);

        scanner.close();
    }

    // Function to find a peak element using Binary Search
    private static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is smaller than its right neighbor, peak must be on the right side
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            }
            // Otherwise, peak must be on the left side (including mid itself)
            else {
                right = mid;
            }
        }

        // When left == right, we've found a peak element
        return left;
    }
}
