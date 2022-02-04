public class Test {
    public static void main(String[] args) {
        
        Teclado [] teclados = new Teclado[100];

        for (int i = 0; i < teclados.length; i++) {
           teclados[i] = new Teclado();
        }

        Teclado t1 = new Teclado("rojo", 100, "Inalambrico", "EN", "compacto");
        
        Teclado t2 = new Teclado();

        Teclado.mostrarContador();

        Ordenador o1 = new Ordenador("Portatil", "azul", t1);

    }
}
