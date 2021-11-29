import java.util.Arrays;
public class Duplicados {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 2, 1, 1, 3, 5,1, 2, 5};

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1 ; j < numeros.length; j++){
                if(numeros[i] == numeros[j]){
                    System.out.print(numeros[i]);
                }
            }
        }
    }
}
