public class Longitud2 {
    public static void main(String[] args) {
        
        int longitud = 2;
        String cadena = "Hola mundo";
        String palabras[] = Utilidades.dividirEnPalabras(cadena);
        boolean palabraIgualLongitud = false;

        for (int i = 0; i < palabras.length; i++) {
            if(palabras[i].length() == longitud){
                palabraIgualLongitud = true;
            }
        }

        if(palabraIgualLongitud == true){
            System.out.println("Hay palabras que tienen una longitud de " + longitud + " caracteres");
        } else {
            System.out.println("No hay ninguna palabra que contiene una longitud de " + longitud + " caracteres");
        }
    }
}