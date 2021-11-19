import java.util.Scanner;
public class Ejemplo38 {
    public static void main(String[] args) {
        int vocalA = 0;
        int vocalE = 0;
        int vocalI = 0;
        int vocalO = 0;
        int vocalU = 0;
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String texto = lector.nextLine();

        for (int i = 0; i < texto.length(); i++) {
            switch (Character.toUpperCase(texto.charAt(i))) {
                case 'A':
                    vocalA++;
                    break;
                case 'E':
                    vocalE++;
                    break;
                case 'I':
                    vocalI++;
                    break;
                case 'O':
                    vocalO++;
                    break;
                case 'U':
                    vocalU++;
                    break;
                default:
                    break;
            }
            lector.close();
        }
        System.out.println("La vocal A aparece " + vocalA);
        System.out.println("La vocal E aparece " + vocalE);
        System.out.println("La vocal I aparece " + vocalI);
        System.out.println("La vocal O aparece " + vocalO);
        System.out.println("La vocal U aparece " + vocalU);
    }
}