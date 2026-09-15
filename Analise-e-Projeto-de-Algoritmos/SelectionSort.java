public class SelectionSort {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 4, 6, 1, 3};
        for (int i = 0; i < numeros.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[menor]) {
                    menor = j;
                }
            }
            int temp = numeros[i];
            numeros[i] = numeros[menor];
            numeros[menor] = temp;
        }
        System.out.println("Vetor organizado: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}