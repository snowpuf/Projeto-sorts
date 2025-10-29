public class GnomeSort {
    public static void sort(int[] arr) {
        int i = 0;
        int n = arr.length;

        while (i < n) {
            if (i == 0 || arr[i] >= arr[i - 1]) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                i--;
            }
        }
    }
}
