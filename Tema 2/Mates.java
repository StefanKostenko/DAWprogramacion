public class Mates {
    
    public static double suma(double numero1,double numero2){
        double resultado  = 0;
        resultado = numero1 + numero2;

        return resultado;
    }

    public static double resta(double numero1,double numero2){
        double resultado = 0;
        resultado = numero1 - numero2;

        return resultado;
    }

    public static double multiplicacion(double numero1,double numero2){
        double resultado  = 0;
        resultado = numero1 * numero2;

        return resultado;
    }

    public static double division(double numero1,double numero2){
        double resultado  = 0;
        resultado = numero1 / numero2;

        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("La suma es igual: " + suma(10, 2));
        System.out.println("La resta es igual: " + resta(10, 2));
        System.out.println("La multiplicacion es igual: " + multiplicacion(10, 2));
        System.out.println("La division es igual: " + division(10, 2));
    }

}
