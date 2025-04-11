import java.util.HashMap;
import java.util.Map;

public class Moda {
    public static int moda(int[] v) {
        // O(1) -> Crear un diccionario para contar las frecuencias
        Map<Integer, Integer> frecuencia = new HashMap<>();
        
        // O(1) -> Inicializar las variables para la frecuencia máxima y la moda
        int maxFrecuencia = 0;
        int moda = v[0];
        
        // O(N) -> Recorrer cada número en el arreglo (donde N es el tamaño del arreglo)
        for (int num : v) {
            // O(1) -> Obtener la frecuencia actual del número, si no está, inicializarla a 0
            int f = frecuencia.getOrDefault(num, 0) + 1;
            
            // O(1) -> Actualizar la frecuencia del número en el diccionario
            frecuencia.put(num, f);
            
            // O(1) -> Si la frecuencia actual es mayor que la máxima, actualizamos la moda
            if (f > maxFrecuencia) {
                maxFrecuencia = f;
                moda = num;
            }
        }
        
        // O(1) -> Devolver el número más frecuente (la moda)
        return moda;
    }

    public static void main(String[] args) {
        // O(N) -> Crear un arreglo de enteros "v" con algunos números, incluyendo repeticiones.
        int[] v = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4}; 
        // O(N) -> Llamar al método 'moda' con el arreglo 'v' y mostrar el número más frecuente en el arreglo.
        System.out.println("El número más frecuente es: " + moda(v));
    }   
}



