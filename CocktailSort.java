public class CocktailSort {
    public static void sort(int[] arr) {
        boolean trocou = true;
        int inicio = 0;
        int fim = arr.length - 1;

        while (trocou) {
            trocou = false;

            for (int i = inicio; i < fim; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    trocou = true;
                }
            }

            if (!trocou) break;
            trocou = false;
            fim--;

            for (int i = fim - 1; i >= inicio; i--) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    trocou = true;
                }
            }

            inicio++;
        }
    }
}
