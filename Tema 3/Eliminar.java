public class Eliminar {
    public static void main(String[] args) {
        int ValorEliminado = Utilidades.leerEntero("Dame un numero para eliminar un elemento del array");
        int[] array ={10,12,14,16,18};

        if (ValorEliminado > array.length) {
            do{
                ValorEliminado = Utilidades.leerEntero("El valor introducido es mayor al admitido");
            }while(ValorEliminado > array.length);   
        }
    
        array[ValorEliminado] = array[4];
        array[4]=0;
        


        for (int i=0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }

    }
}