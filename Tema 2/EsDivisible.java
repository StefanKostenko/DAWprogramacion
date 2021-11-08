public class EsDivisible {
    public static int esDivisible(int n, int m){
        int resto;

        resto = n%m;

        return resto;
    }

    public static void main(String[] args) {
        boolean divisible;

        if(esDivisible(4, 3) != 0){
            divisible = false;
            System.out.println("No es divisible!");
        } else{
            divisible = true;
            System.out.println("Es divisible!");
        }
    }
}
