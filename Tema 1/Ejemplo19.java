import java.util.Scanner;

public class Ejemplo19 {
    public static void main(String[] args) {
        
        int horas, horasDeMas;
        double eurosPorHora, bruto, neto, impuestors;
        Scanner valorEntrante;
        valorEntrante = new Scanner(System.in);

        System.out.println("Escribeme los euros por horas que ganas: ");
        eurosPorHora = valorEntrante.nextDouble();

        System.out.println("Escribeme las horas que has trabajado este mes: ");
        horas = valorEntrante.nextInt();

        valorEntrante.close();
        
        if(horas <= 35){
            bruto = eurosPorHora * horas;
        }else {
            horasDeMas = horas - 35;
            bruto = (((eurosPorHora * horasDeMas) * 1.5) + (eurosPorHora * 35));
        }

            if(bruto <= 500.0){
                neto = bruto;
            }else if(bruto <= 900.0){
                neto = bruto * 0.75;
            }else{
                neto = bruto * 0.55;
            }

            System.out.println ("El salario bruto es: " + bruto + " euros");
            System.out.println("El salario neto es: " + neto + " euros");
            System.out.println("El impusto es de unos : " + (bruto - neto) + " euros");
    }
}
