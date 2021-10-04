import java.util.Scanner;

public class Ejemplo18 {
    public static void main(String[] args) {
        
        int horas;
        int minutos;
        int segundos;
        int seg_horas;
        int seg_minutos;
        int seg_tot;

        System.out.println("Dame el valor de horas: ");
        horas = valorEntrante.nextInt();

        System.out.println("Dame el valor de minutos: ");
        minutos = valorEntrante2.nextInt();

        System.out.println("Dame el valor de los segundos: ");
        segundos = valorEntrante3.nextInt();

        valorEntrante.close();

        if (horas = 0 <= 23 && minutos = 0 <= 59 && segundos = 0 <= 60) {
            seg_horas = horas * 3600;
        seg_minutos = minutos * 60;
        seg_tot = seg_horas + seg_minutos + segundos;

        System.out.println(seg_tot);

        } else {
            System.out.println("Usted ha introducido algun valor mal.");
        }
        
    }
}
