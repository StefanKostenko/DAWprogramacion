public class CompararIgnoreCase {
    public static void main(String[] args) {
        
        String cadena1 = "hola", cadena2 = "Hola";
        int compararCadenas;
        
        compararCadenas = cadena1.compareToIgnoreCase(cadena2);

        if(compararCadenas == 0){
            System.out.println("La cadena 1 es igual a la 2");
        } else if(compararCadenas < 0){
            System.out.println("La cadena 2 es mas grande que la 1");
        } else if(compararCadenas > 0){
            System.out.println("La cadena 1 es mas grande que la 2");
        }
    }
}
