import java.util.Arrays;

/**
 * This class provides a method to compute the local maximum of an array.
 */
public class LocalMax {

    /**
     * Computes the local maximum of an array.
     * A local maximum is a slice of the array in which each element decreases from the middle to the edges with a given radius. Example: {1, 2, 5, 4, 3} is a local maximum with a radius of 2.
     * @param arr given array to find the local maximum in
     * @param radius the radius of the local maximum. Example: radius = 2 -> 5 elements
     * @return the local maximum or null if not found
     */
    public static int[] compute(int[] arr, int radius) {
        return localMax(arr, radius, 0, arr.length);
    }

    /**
     * Recursive method to that either returns the local maximum or calls itself with a smaller range.
     * @param arr the array stays always the original one instead of being sliced and is narrowed down by the parameters low and high.
     * 
     * @param low the lower bound within the array
     * @param high the upper bound within the array
     * @return a local maximum or null if not found
     */
    private static int[] localMax(int[] arr, int raduis, int low, int high) {
        int mid = low + (high - low) / 2; //middle between low and high
        if (mid + raduis >= high || mid - raduis < low) {
            return null;
        }
        if (isLocalMax(arr, raduis, mid)) {
            return Arrays.copyOfRange(arr, mid-raduis, mid+raduis+1);
        } else {
            if (arr[mid]-1 < arr[mid+1]) {
                return localMax(arr, raduis, low, mid);
            } else {
                return localMax(arr, raduis, mid, high);
            }
        }
    }

    /**
     * Evaluates if the range between mid-radius and mid+radius is a local maximum.
     * @param mid middle bewteen low and high
     */
    private static boolean isLocalMax(int[] arr, int radius, int mid) {
        for (int i = mid; i > mid - radius; i--) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }
        for (int i = mid; i < mid + radius; i++) {
            if (arr[i] < arr[i+1]) {
                return false;
            }
        }
        return true;
    }

}
