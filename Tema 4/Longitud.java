public class Longitud {
    public static void main(String[] args) {
        
        int longitud = 4;
        String cadena = "Hola mundo";
        String palabras[] = Utilidades.dividirEnPalabras(cadena);
        int contadorDePalabras = 0;

        for (int i = 0; i < palabras.length; i++) {
            if(palabras[i].length() == longitud){
                contadorDePalabras++;
            }
        }

        System.out.println("Hay " + contadorDePalabras + " con la longitud " + longitud);
    }
}
