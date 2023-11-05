public class SearchAlgorithms {

    /**
     * Linear search algorithm
     * @param arr The array to search
     * @param key The key to search for
     * @return The index of the key in the array, or -1 if not found
     */
    public int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Iterative binary search algorithm
     * @param arr The ORDERED array to search
     * @param key The key to search for
     * @return The index of the key in the array, or -1 if not found
     */
    public int iterativeBinarySearch(int[] arr, int key) {
        int l = 0;
        int r = arr.length - 1;
        int m = (l + r) / 2;
        while (arr[m] != key) {
            m = (l + r) / 2;
            if (arr[m] > key) {
                r = m - 1;
            } else {
                l = m + 1;
            }
            if (l > r) {
                return -1;
            }
        }
        return m;
    }

    /**
     * Recursive binary search algorithm
     * @param key The key to search for
     * @param l The leftmost index of the array
     * @param r The rightmost index of the array
     * @param arr The ORDERED array to search
     * @return The index of the key in the array, or -1 if not found
     */
    public int recursiveBinarySearch(int key, int l, int r, int[] arr) {
        int m;
        if (r < l) {
            return -1;
        } else {
            m = (l + r) / 2;
            if (key < arr[m]) {
                recursiveBinarySearch(key, l, m - 1, arr);
            } else {
                if (key > arr[m]) {
                    recursiveBinarySearch(key, m + 1, r, arr);
                } else {
                    return m;
                }
            }
        }
        return -1;
    }
}
