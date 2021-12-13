public class Contains {
    public static void main(String[] args) {
        String cadena = "Hola";
        boolean resultado = cadena.contains("Hi");

        if(resultado == true){
            System.out.println("La cadena contiene a a la otra");
        } else{
            System.out.println("La cadena no contiene a a la otra");
        }
    }
}
