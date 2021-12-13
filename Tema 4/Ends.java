public class Ends {
    public static void main(String[] args) {
        String cadena = "Hola";
        boolean resultado = cadena.endsWith("sla");

        if(resultado == true){
            System.out.println("La cadena acaba con el contenido de la otra");
        } else{
            System.out.println("La cadena no acaba con el contenidode la otra");
        }
    }
}
