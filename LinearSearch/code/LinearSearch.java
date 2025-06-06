public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9};
        int target = 7;
        int result = linearSearch(arr, target);
        System.out.println("Target found at index: " + result);
    }
}
