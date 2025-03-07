import java.util.Scanner;

public class Problem01_FindRotationPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Rotated sorted array
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the rotated sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Finding the index of the smallest element (rotation point)
        int rotationIndex = findRotationPoint(arr);

        // Output: Index of the smallest element
        System.out.println("Index of the smallest element (rotation point): " + rotationIndex);

        scanner.close();
    }

    // Function to find the rotation point using Binary Search
    private static int findRotationPoint(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2; // Avoids potential overflow

            // If mid element is greater than right, the smallest element is in the right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            }
            // If mid element is less than right, the smallest element is in the left half
            else {
                right = mid;
            }
        }

        // When left equals right, we've found the smallest element
        return left;
    }
}
