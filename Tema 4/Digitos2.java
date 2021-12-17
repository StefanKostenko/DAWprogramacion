public class Digitos2 {
    public static void main(String[] args) {
        String cadena = "12 sa 2  123";
        String palabras[] = Utilidades.dividirEnPalabras(cadena);
        int numeros = 0;

        for (int i = 0; i < palabras.length; i++) {
            for (int j = 0; j < palabras[i].length(); j++) {
                if(Character.isDigit(palabras[i].charAt(j))){
                    
                    while(j < palabras[i].length() && Character.isDigit(palabras[i].charAt(j))){
                        j++;
                    }

                    numeros++;
                }

            }

        }
        System.out.println("La cadena tiene " + numeros + " numeros.");
    }
}
