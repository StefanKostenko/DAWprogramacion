public class Primo {
    
    public static boolean esPrimo(int numero){
        
        boolean resultado = false;
        int contador = 1;

        for (int i = 2; i < numero; i++) {
            if(numero%i == 0){
                contador++;
            }
        }

        if(contador <= 2){
            resultado = true;
        } else{
            resultado = false;
        }
        return resultado;
    }
    public static void main(String[] args) {
        System.out.println(esPrimo(13));
        System.out.println(esPrimo(11));
        System.out.println(esPrimo(12));
    }
}
