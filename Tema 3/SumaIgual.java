public class SumaIgual {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int numeroUsuario = 5;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1 ; j < numeros.length; j++){
                if(numeros[i] + numeros[j] == numeroUsuario){
                    System.out.println(numeros[i] + " " +  numeros[j]);
                }
            }
        }
    }
}
