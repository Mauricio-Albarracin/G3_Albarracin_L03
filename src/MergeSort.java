public class MergeSort {
    
    // Método principal de ordenamiento por fusión
    public static void mergeSort(int[] arreglo) {
        if (arreglo.length < 2) return; // Caso base: si el arreglo tiene 1 o 0 elementos, ya está ordenado
        
        int mitad = arreglo.length / 2; // Calculamos el punto medio del arreglo

        // Creamos dos subarreglos para dividir el original
        int[] izquierda = new int[mitad];
        int[] derecha = new int[arreglo.length - mitad];

        // Llenamos el subarreglo izquierdo
        for (int i = 0; i < mitad; i++) {
            izquierda[i] = arreglo[i];
        }

        // Llenamos el subarreglo derecho
        for (int i = mitad; i < arreglo.length; i++) {
            derecha[i - mitad] = arreglo[i];
        }

        // Llamadas recursivas para ordenar cada mitad
        mergeSort(izquierda);
        mergeSort(derecha);

        // Fusionamos ambas mitades ordenadas
        merge(arreglo, izquierda, derecha);
    }

    // Método para fusionar dos subarreglos ordenados en uno solo
    public static void merge(int[] arreglo, int[] izquierda, int[] derecha) {
        int i = 0, j = 0, k = 0; // i: índice para izquierda, j: para derecha, k: para arreglo

        // Comparamos y fusionamos los elementos en orden
        while (i < izquierda.length && j < derecha.length) {
            if (izquierda[i] <= derecha[j]) {
                arreglo[k++] = izquierda[i++]; // El menor elemento va al arreglo principal
            } else {
                arreglo[k++] = derecha[j++];
            }
        }

        // Si quedan elementos en la izquierda, los copiamos
        while (i < izquierda.length) {
            arreglo[k++] = izquierda[i++];
        }

        // Si quedan elementos en la derecha, los copiamos
        while (j < derecha.length) {
            arreglo[k++] = derecha[j++];
        }
    }

    // Método principal para probar el algoritmo
    public static void main(String[] args) {
        int[] numeros = {8, 4, 5, 1, 9, 2}; // Arreglo desordenado
        mergeSort(numeros); // Ordenamos con Merge Sort
        
        // Mostramos el resultado
        System.out.print("Arreglo ordenado: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
