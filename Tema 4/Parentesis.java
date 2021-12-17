public class Parentesis {
    public static void main(String[] args) {
        String cadena = "una )cadena (mal (parentizada)";
        int contadorParentesis = 0, posicionParentesis = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == '('){
                contadorParentesis++;
            } 

            if(cadena.charAt(i) == ')'){
                contadorParentesis--;
            }
            if(contadorParentesis == -1){
                break;
            }
        }

        if(contadorParentesis == 0){
            System.out.println("Está bien parentizada");
        } else {
            System.out.println("No está bien parentizada");
        }
    }
}
