import java.util.Arrays;
public class Duplicados {
    public static void main(String[] args) {
        int[] numeros =  new int[20];

        Utilidades.rellenaArray(numeros, -30, 30);
        System.out.println("Array original: " + Arrays.toString(numeros));
        numerosDuplicados(numeros);
    }

    private static void numerosDuplicados(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1 ; j < numeros.length; j++){
                if(numeros[i] == numeros[j]){
                    System.out.println(numeros[j]);
                }
            }
        }
    }
}
