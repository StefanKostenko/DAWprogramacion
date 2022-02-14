public class ArrayRepaso {
    public static void main(String[] args) {
        int[] numeros = new int[1000];

        int multiples3 = 3;
        int multiples7 = 7;
        
        for (int i = 0; i < numeros.length; i += 2) {
            numeros[i] = multiples3;
            multiples3 += 3;
        }

        for (int i = 1; i < numeros.length; i += 2) {
            numeros[i] = multiples7;
            multiples7 += 7;
        }

        for (int i = 13; i < numeros.length; i += 13) {
            System.out.println(numeros[i]);
        }
    }
}
