import java.util.Scanner;

public class Problem04_FirstLastOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Sorted array and target element
        System.out.println("Enter the number of elements in the sorted array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the sorted elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the target element:");
        int target = scanner.nextInt();

        // Finding first and last occurrence
        int firstIndex = findFirstOccurrence(arr, target);
        int lastIndex = findLastOccurrence(arr, target);

        // Output result
        System.out.println("First Occurrence: " + firstIndex);
        System.out.println("Last Occurrence: " + lastIndex);

        scanner.close();
    }

    // Function to find the first occurrence of the target
    private static int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid; // Store index and continue searching left
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1; // Move right
            } else {
                right = mid - 1; // Move left
            }
        }
        return result;
    }

    // Function to find the last occurrence of the target
    private static int findLastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid; // Store index and continue searching right
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1; // Move right
            } else {
                right = mid - 1; // Move left
            }
        }
        return result;
    }
}
