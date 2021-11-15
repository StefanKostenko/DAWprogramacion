public class Potencia {
    
    public static double potencia(double x, int n){
        if(n == 0){
            return 1;
        } else {
            return (x * potencia(x, n-1));
        }
    }

    public static void main(String[] args) {
        System.out.println(potencia(3.0, 2));
    }
}
