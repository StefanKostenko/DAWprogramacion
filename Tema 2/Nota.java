public class Nota {

    public static void main(String[] args) {
        int valor = Integer.parseInt(args[0]);
        
        nota(valor);
    }

    public static void nota(int x) {
        
        if (x < 3){
            System.out.println("Muy deficiente");
        }else if (x < 5){
            System.out.println("Insuficiente");
        }else if(x < 6){
            System.out.println("Suficiente");
        }else if(x < 7){
            System.out.println("Bien");
        }else if(x < 9){
            System.out.println("Notable");
        }else if(x <= 10){
            System.out.println("Sobresaliente");
        }else {
            System.out.println("Pon una nota entre el rango 0-10.");
        }
    }
}