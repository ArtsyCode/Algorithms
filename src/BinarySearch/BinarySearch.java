/**
 * Binary search
 *
 * @author Lorne Millwood
 */
public class BinarySearch {

    public static int binarySearch(int[] values, int key) {
        int high = values.length - 1;
        int low = 0;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midValue = values[mid];
            if (midValue < key) {
                low = mid + 1;
            } else if (midValue > key) {
                high = mid - 1;
            } else {
                //found it
                return mid;
            }
        }
        // key not found
        return -1;
    }
}