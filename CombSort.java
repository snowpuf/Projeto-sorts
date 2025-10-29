public class CombSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        boolean trocou = true;

        while (trocou) {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    trocou = true;
                }
            }
            n--; //
        }
    }
}
