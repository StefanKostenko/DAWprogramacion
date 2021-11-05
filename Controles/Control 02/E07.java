import java.util.*;
public class E07 {
    public static void main(String[] args) {
        
        int hora, cantidadDeHoras, horaFutura, resta;
        Scanner lector;
        lector = new Scanner(System.in);

        System.out.print("Hora actual: ");
        hora = lector.nextInt();

        System.out.print("Cantidad de horas: ");
        cantidadDeHoras = lector.nextInt();

        horaFutura = hora + cantidadDeHoras;

        if(horaFutura < 24){
            System.out.println("En " + cantidadDeHoras + "  horas,  el reloj marcara las " + horaFutura);
        } else {
            resta = horaFutura/24;
            horaFutura -= 24 * resta;
            System.out.println("En " + cantidadDeHoras + " horas, el reloj marcara las " + horaFutura);
        }
        lector.close();
    }
}
