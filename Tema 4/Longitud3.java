public class Longitud3 {
    public static void main(String[] args) {
        
        int longitud = 6;
        String cadena = "Hola mundo";
        String palabras[] = Utilidades.dividirEnPalabras(cadena);
        boolean palabraIgualLongitud = false;

        for (int i = 0; i < palabras.length; i++) {
            if(palabras[i].length() >= longitud){
                palabraIgualLongitud = true;
            }
        }

        if(palabraIgualLongitud == true){
            System.out.println("Hay alguna palabra larga en caso contrario");
        } else {
            System.out.println("Todas las cadenas son cortas");
        }
    }
}