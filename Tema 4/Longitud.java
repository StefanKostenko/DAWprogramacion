public class Longitud {
    public static void main(String[] args) {
        
        String cadena = "Hola mundo, k tal k?";
        int contador = 0;

        if(cadena.contains("k")){
            contador++;
        }

        System.out.println("Hay tal numero de caracteres de k " + contador);
    }
}
