public class RellenarMatriz {
    public static void main(String[] args) {
        int [][] matriz = new int[10][10];
        int filas = matriz.length;
		int columnas = matriz[0].length;

		for (int i = 0; i < filas; i++){
			for (int j = 0; j < columnas; j++){
			    matriz[i][j] = (int) (Math.random() * (1 - 0 + 1));
			}
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
