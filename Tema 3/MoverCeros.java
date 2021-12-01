public class MoverCeros {
    public static void main(String[] args) {
        int[] numeros = {0,1,2,3,0,5};
        int contador = 0;

        for (int i = ; i < numeros.length; i++) {
            if(numeros[i] == 0){
               contador++;
            }
        }
        Utilidades.mostrarArray(numeros);

        public static void eliminarNumero(int[] numeros, int indice) {
            int numeroBorrado = numeros[indice];
    
            for (int i = indice + 1; i < numeros.length; i++) {
                numeros[i - 1] = numeros[i];
            }
            numeros[numeros.length - 1] = numeroBorrado;
        }
    }
}
