public class CompararIgnoreCase {

    public static int CompararIgnoreCase(String cadena1, String cadena2){
        return cadena1.compareToIgnoreCase(cadena2);
    }

    public static void main(String[] args) {

        String cadena1 = "hola", cadena2 = "Hola";
        int resultado = CompararIgnoreCase(cadena1, cadena2);

        if(resultado == 0){
            System.out.println("La cadena 1 es igual a la 2");
        } else if(resultado < 0){
            System.out.println("La cadena 2 es mas grande que la 1");
        } else if(resultado > 0){
            System.out.println("La cadena 1 es mas grande que la 2");
        }
    }
}
