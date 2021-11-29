public class Eliminar {
    public static void main(String[] args) {

        //int [] numeros = new int[10];

        //Utilidades.rellenaArray(numeros, 1, 10);

        int [] numeros = {1,2,3,4,4,3,2,6,9};
        int indice;

        indice = obtenIndice(numeros);

        eliminarNumero(numeros, indice);

        Utilidades.mostrarArray(numeros);
    }

    public static int obtenIndice(int[] numeros){
        int indice;
        do{
            indice = Utilidades.leerEntero("Indice de eliminar un numero de la array: ");
        } while ((indice < 0) || (indice > (numeros.length - 1)));
        return indice;
    }

    public static void eliminarNumero(int[] numeros, int indice) {
        int numeroBorrado = numeros[indice];

        for (int i = indice + 1; i < numeros.length; i++) {
            numeros[i - 1] = numeros[i];
        }
        numeros[numeros.length - 1] = numeroBorrado;
    }
}