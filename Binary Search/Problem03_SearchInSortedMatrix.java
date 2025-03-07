
import java.util.Scanner;

public class Problem03_SearchInSortedMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input matrix elements
        System.out.println("Enter the elements of the sorted matrix row-wise:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Input target element
        System.out.println("Enter the target value to search:");
        int target = scanner.nextInt();

        // Perform binary search in the matrix
        boolean found = searchMatrix(matrix, target);

        // Output the result
        if (found) {
            System.out.println("Target value found in the matrix.");
        } else {
            System.out.println("Target value not found in the matrix.");
        }

        scanner.close();
    }

    // Function to perform binary search in a sorted 2D matrix
    private static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Convert 1D index to 2D indices
            int row = mid / cols;
            int col = mid % cols;
            int midValue = matrix[row][col];

            // If the middle element is the target, return true
            if (midValue == target) {
                return true;
            }
            // If target is smaller, search the left half
            else if (midValue > target) {
                right = mid - 1;
            }
            // If target is larger, search the right half
            else {
                left = mid + 1;
            }
        }

        // Target not found
        return false;
    }
}
