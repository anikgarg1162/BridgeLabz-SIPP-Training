import java.util.*;
public class SearchComparison {

    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    // Binary Search 
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int N = 1_000_000;
        int[] data = new int[N];
        Random rand = new Random();

        for (int i = 0; i < N; i++) {
            data[i] = rand.nextInt(N);
        }

        int target = data[N - 1];  

        // Linear Search 
        long start = System.nanoTime();
        int index1 = linearSearch(data, target);
        long end = System.nanoTime();
        System.out.println("Linear Search Time: " + (end - start) / 1_000_000.0 + " ms");

        Arrays.sort(data);

        // Binary Search 
        start = System.nanoTime();
        int index2 = binarySearch(data, target);
        end = System.nanoTime();
        System.out.println("Binary Search Time: " + (end - start) / 1_000_000.0 + " ms");
    }
}
