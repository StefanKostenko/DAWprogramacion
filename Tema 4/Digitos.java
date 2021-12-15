public class Digitos {
    public static void main(String[] args) {
        String cadena = "Hoy es el dia 15 del 12";
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if(Character.isDigit(cadena.charAt(i))){
                contador++;
            }
        }
        System.out.println("Hay " + contador + " digitos.");
    }
}
