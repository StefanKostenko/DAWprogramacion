public class Invertida {
    public static void main(String[] args) {
        String cadena = "frase una es Esto";
        String[] palabras = Utilidades.dividirEnPalabras(cadena);

        for (int i = palabras.length - 1; i >= 0; i--) {
            System.out.print(palabras[i] + " ");
        }
    }
}
