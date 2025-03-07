package org.example;

import java.util.Arrays;
import java.util.Random;

public class Problem01_SearchComparison {
    // Linear Search: O(N)
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Target element found
            }
        }
        return -1; // If we don't find the target element
    }

    // Binary Search: O(logN)
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Target element is not found
    }

    public static void main(String[] args) {
        int N = 1_000_000; // Dataset size
        int[] dataset = new int[N];

        // Generate random dataset
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            dataset[i] = random.nextInt(1_000_000); // Random numbers between 0 and 999999
        }

        // Pick a random target from dataset
        int target = dataset[random.nextInt(N)];

        // Measure Linear Search Time
        long startTime = System.nanoTime();
        linearSearch(dataset, target);
        long endTime = System.nanoTime();
        System.out.println("Linear Search Time: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // Sort dataset for Binary Search
        Arrays.sort(dataset);

        // Measure Binary Search Time
        startTime = System.nanoTime();
        binarySearch(dataset, target);
        endTime = System.nanoTime();
        System.out.println("Binary Search Time: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}
