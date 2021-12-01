public class Iguales {
    public static void main(String[] args) {
        int [] numeros1 = {1,2,3,4,5};
        int [] numeros2 = {1,2,3,4,5,7};
        boolean sonIguales = true;

        if(numeros1.length != numeros2.length){
            System.out.println("No son iguales!");
        }else{
            for (int i = 0; i < numeros2.length; i++) {
                if(numeros1[i] != numeros2[i]){
                    sonIguales = false;
                    break;
                }
            }
            if(sonIguales){
                System.out.println("Son iguales!");
            }else{
                System.out.println("No son iguales!");
            }
        }

    }
}
