public class InsertionSort {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 5, 3, 6, 1};
        for (int i = 1; i < numeros.length; i++) {
            int chave = numeros[i];
            int j = i - 1;
            while (j >= 0 && numeros[j] > chave) {
                numeros[j + 1] = numeros[j];
                j--;
            }
            numeros[j + 1] = chave;
        }
        System.out.println("Vetor organizado:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}