public class Comparar {
    public static void main(String[] args) {
        
        String cadena1 = "aaa", cadena2 = "AAA";
        int compararCadenas;
        
        compararCadenas = cadena1.compareTo(cadena2);

        if(compararCadenas == 0){
            System.out.println("La cadena 1 es igual a la 2");
        } else if(compararCadenas < 0){
            System.out.println("La cadena 2 es mas grande que la 1");
        } else if(compararCadenas > 0){
            System.out.println("La cadena 1 es mas grande que la 2");
        }

    }
}
