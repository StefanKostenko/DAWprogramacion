public class MoverCeros {
    public static void main(String[] args) {
        int[] numeros = {0,1,2,3,0,5};
        int [] numerosCopia = new int[numeros.length];
        int j = 0;

        for (int i = 0; i < numerosCopia.length; i++) {
            if(numeros[i] != 0){
                numerosCopia[j] = numeros[i];
                j++;
            }
        }
        
        numeros = numerosCopia;

        Utilidades.mostrarArray(numerosCopia);

    }
}

