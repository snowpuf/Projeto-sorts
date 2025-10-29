public class Main {
    public static void main(String[] args) {

        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        int[][] vetores = {vetor1, vetor2, vetor3};
        String[] nomesVetores = {"Vetor 1 (aleatorio)", "Vetor 2 (ordenado)", "Vetor 3 (invertido)"};

        for (int i = 0; i < vetores.length; i++) {
            System.out.println("-_-_-_-_-_-_-_-_-_-_");
            System.out.println(" Testando " + nomesVetores[i]);
            System.out.println("-_-_-_-_-_-_-_-_-_-_");


            int[] v1 = vetores[i].clone();
            int[] v2 = vetores[i].clone();
            int[] v3 = vetores[i].clone();
            int[] v4 = vetores[i].clone();
            int[] v5 = vetores[i].clone();
            int[] v6 = vetores[i].clone();

            long inicio, fim;

            inicio = System.nanoTime();
            CombSort.sort(v1);
            fim = System.nanoTime();
            System.out.println("Comb Sort:           " + (fim - inicio) + " ns");

            inicio = System.nanoTime();
            GnomeSort.sort(v2);
            fim = System.nanoTime();
            System.out.println("Gnome Sort:          " + (fim - inicio) + " ns");

            inicio = System.nanoTime();
            BucketSort.sort(v3);
            fim = System.nanoTime();
            System.out.println("Bucket Sort:         " + (fim - inicio) + " ns");

            // bubble Sort (com flag)
            inicio = System.nanoTime();
            BubbleSort.sort(v4);
            fim = System.nanoTime();
            System.out.println("Bubble Sort (flag):  " + (fim - inicio) + " ns");

            inicio = System.nanoTime();
            SelectionSort.sort(v5);
            fim = System.nanoTime();
            System.out.println("Selection Sort:      " + (fim - inicio) + " ns");

            inicio = System.nanoTime();
            CocktailSort.sort(v6);
            fim = System.nanoTime();
            System.out.println("Cocktail Sort:       " + (fim - inicio) + " ns");
        }
    }
}
