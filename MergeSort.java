class Tester {

    public static void mergeSort(int[] elements, int size) {
        if (size < 2) {
            return; // Base case: array of size 1 is sorted
        }

        int mid = size / 2;
        int[] left = new int[mid];
        int[] right = new int[size - mid];

        // Copy data to left and right arrays
        for (int i = 0; i < mid; i++) {
            left[i] = elements[i];
        }
        for (int i = mid; i < size; i++) {
            right[i - mid] = elements[i];
        }

        // Recursively sort left and right halves
        mergeSort(left, mid);
        mergeSort(right, size - mid);

        // Merge sorted halves back into original array
        merge(elements, left, right, mid, size - mid);
    }

    public static void merge(int[] elements, int[] left, int[] right, int leftMerge, int rightMerge) {
        int i = 0, j = 0, k = 0;

        // Merge left and right arrays into elements[]
        while (i < leftMerge && j < rightMerge) {
            if (left[i] <= right[j]) {
                elements[k++] = left[i++];
            } else {
                elements[k++] = right[j++];
            }
        }

        // Copy remaining elements from left[], if any
        while (i < leftMerge) {
            elements[k++] = left[i++];
        }

        // Copy remaining elements from right[], if any
        while (j < rightMerge) {
            elements[k++] = right[j++];
        }
    }

    public static double findMedian(int elements[]) {
        int n = elements.length;
        if (n % 2 != 0) {
            // Odd length — middle element
            return elements[n / 2];
        } else {
            // Even length — average of two middle elements
            return (elements[(n / 2) - 1] + elements[n / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int elements[] = { 64, 34, 25, 12, 22, 11, 90 };
        mergeSort(elements, elements.length);
        System.out.println("Sorted Array:");
        for (int num : elements) {
            System.out.print(num + " ");
        }
        System.out.println("\nMedian: " + findMedian(elements));
    }
}
