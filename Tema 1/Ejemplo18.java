import java.util.Scanner;

public class Ejemplo18 {
    public static void main(String[] args) {
        
        //Variables asignadas
        int horas, minutos, segundos, segAtot, horasTot, segRestantesHoras, segRestantesMinutos, minutosTot ;
        Scanner valorEntrante;
        valorEntrante = new Scanner(System.in);

        System.out.println("Dame el valor de horas: ");
        horas = valorEntrante.nextInt();

        System.out.println("Dame el valor de minutos: ");
        minutos = valorEntrante.nextInt();

        System.out.println("Dame el valor de los segundos: ");
        segundos = valorEntrante.nextInt();

        valorEntrante.close();

        //la condicion horas tieneq ser como maximo 24
        if (horas < 24) {
            //Esta condicion se cumplira si la horas es < 24
            if (minutos < 60){
                    //Si llegamos aqui es porque todas las condiciones son correctas y ya podremos hacer los calculos para gastar menos recursos a la maquina.
                    if(segundos < 60){
                    //Aqui calculamos todos los segundos de los valores entrantes por el usuario y le sumamos un segundo.
                    segAtot = ((horas * 3600) + (minutos * 60) + segundos + 1);
                    //Aqui sacamos todas las horas que nos salen. 
                    horasTot = (segAtot/3600);
                    //Aqui calculamos los segundos restantes despues de calcular las horas.
                    segRestantesHoras = (horasTot * 3600);
                    //Aqui calculamos los minutos totales despues de saber las horas que tenemos y los segundos que nos quedan.
                    minutosTot = ((segAtot - segRestantesHoras)/60);
                    //Y por ultimos calcuamos los segundos restantes que nos quedan.
                    segRestantesMinutos = ((segAtot - segRestantesHoras) - minutosTot*60);

                    System.out.println(horasTot + "h : " + minutosTot + "m : " + segRestantesMinutos + "s");
                } else {
                    System.out.println("Usted ha introducido algun valor de forma incorrecta, el maximo valor que puede darme es 23h : 59m: 59s!");
                }
            } else {
                System.out.println("Usted ha introducido algun valor de forma incorrecta, el maximo valor que puede darme es 23h : 59m: 59s!");
            }

        } else {
            System.out.println("Usted ha introducido algun valor de forma incorrecta, el maximo valor que puede darme es 23h : 59m : 59s!");
        }

    }
}