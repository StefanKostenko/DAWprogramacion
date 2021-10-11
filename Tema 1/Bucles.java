public class Bucles {
    public static void main(String[] args) {
         int i;

         for (i = 0; i < 10; i++) {
             System.out.println("Hola: " + i);
         }
         
         i = 0;

         while(i < 10){
            System.out.println("Hola: " + i);
            i++;
         }

         i = 0;

         do {
             System.out.println("Hola: " + i);
             i++;
         } while (i < 10);
    }
}
