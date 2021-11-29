public class Comunes {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {2,6,9,7,5};

        extracted(array1, array2);
    }

    public static void extracted(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]){
                    System.out.println(array1[i]);
                }
            }
        }
    }
}
