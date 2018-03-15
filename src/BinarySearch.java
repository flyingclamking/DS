public class BinarySearch {

    public static int search(int[] array, int target) {

        if (array == null || array.length == 0) {
            return -1;
        }

        int start = 0;
        int end = array.length;

        while (start <= end) {
            int mid = (start + end) >>> 1;
            if (array[mid] > target) {
                end = mid - 1;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}