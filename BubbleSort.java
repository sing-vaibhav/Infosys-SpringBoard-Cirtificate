import java.util.Arrays;

class Tester {

    public static void sortArray(int arr[]) {
        Arrays.sort(arr);  // Sorts in ascending order
    }

    public static int findMaxSum(int arr[], int m) {
        int sum = 0;
        // sum the last m elements (largest)
        for (int i = arr.length - m; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int findMinSum(int arr[], int m) {
        int sum = 0;
        // sum the first m elements (smallest)
        for (int i = 0; i < m; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        sortArray(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Maximum Sum for m=4: " + findMaxSum(arr, 4));
        System.out.println("Minimum Sum for m=3: " + findMinSum(arr, 3));
    }
}
