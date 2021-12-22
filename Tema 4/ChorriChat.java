import java.util.concurrent.ThreadLocalRandom;

public class ChorriChat {
    public static void main(String[] args) {
        String mensajeSaludo, mensajeUsuario;
        String mensajeDeChorri[] = {"Mmm, es un tema interesante", "No he entendido lo que dices", "Nooo hablooo tu idioma"};
        
        do{
            System.out.println("Eres una persona mal educada :(");
            mensajeSaludo = Utilidades.leerCadena(">>>");
        }
        while(!saludo(mensajeSaludo));

        if(saludo(mensajeSaludo)){
            System.out.println("Hola, soy Chorri, tus asistente.");

            do{
                mensajeUsuario = Utilidades.leerCadena(">>>");
                int indiceAleatorio = numeroAleatorioEnRango(0, mensajeDeChorri.length -1);
                String mensajeDeChorriAleatorio = mensajeDeChorri[indiceAleatorio];
                System.out.println(mensajeDeChorriAleatorio);
                

            }while(!esFin(mensajeUsuario));

            if(esFin(mensajeUsuario)){
                System.out.println("Ha sido un placer, bebé <3");
            }
            
            
        }


    }

    private static int numeroAleatorioEnRango(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo +1);
    }

    public static boolean saludo(String mensajeSaludo){
        String minusculas = mensajeSaludo.toLowerCase();
        
        if(minusculas.equals("hola")){
            return true;
        }else if(minusculas.equals("buenos dias")){
            return true;
        }else if(minusculas.equals("buenas")){
            return true;
        }else{
            return false;
        }
    }

    public static boolean esFin(String mensajeUsuario){
        String minusculas = mensajeUsuario.toLowerCase();

        if(minusculas.equals("chao")){
            return true;
        }else if(minusculas.equals("ta luego")){
            return true;
        }else if(minusculas.equals("adios")){
            return true;
        }else{
            return false;
        }
    }

}
