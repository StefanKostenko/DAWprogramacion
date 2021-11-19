import java.util.Scanner;
public class MayorDeTres{
    public static void mayordetres(int m, int n, int o) {
       if (m > n) {
            System.out.println("El numero mayor es: " + m);
       }else if(n > o){
            System.out.println("El numero mayor es: " + n);
       }else{
            System.out.println("El numero mayor es: " + o);
       } 
    }

    public static void main(String[] args) {
        int m, n, o;
        Scanner lector = new Scanner(System.in);

        System.out.println("Dame un numero: ");
        m = lector.nextInt();

        System.out.println("Dame un numero: ");
        n = lector.nextInt();

        System.out.println("Dame un numero: ");
        o = lector.nextInt();

        mayordetres(m, n, o);

        lector.close();
    }
}