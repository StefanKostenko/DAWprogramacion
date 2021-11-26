public class Eliminar {
    public static void main(String[] args) {

        //int [] numeros = new int[10];

        //Utilidades.rellenaArray(numeros, 1, 10);

        int [] numeros = {1,2,3,4,4,3,2,6,9};

        int indice = 2;

        for (int i = indice + 1; i < numeros.length; i++) {
            numeros[i - 1] = numeros[i];
        }
        numeros[numeros.length - 1] = 0;
    }
}