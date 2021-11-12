public class Positivos {
    
    public static int positivos(int[] numeros){
        int resultado = 0;

        for(int i=0; i < numeros.length; i++){
            if(numeros[i] >= 0){
                resultado++;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        int [] numeritos = {1, 3, -5 , 3, 10, -2};
        System.out.println(positivos(numeritos));
    }
}
