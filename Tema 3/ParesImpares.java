public class ParesImpares {
    public static void main(String[] args) {
        int[] numeros= {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] %2 == 0){
                System.out.println("Pares " + numeros[i]);
            }else{
                System.out.println("Impares " + numeros[i]);
            }
        }
    }
}
