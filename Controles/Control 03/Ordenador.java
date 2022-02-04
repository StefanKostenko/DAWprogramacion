public class Ordenador {
    
    private static String [] colores = {"Negro" , "Blanco" , "Rojo" , "Azul" , "Gris" };
    private static String [] formatos = {"Sobremesa" , "Portatil"};

    // Atributos privados

    private String formato;
    private String color;
    private Teclado teclado;

    // Constructor vacio

    public Ordenador(){
        this.color = Ordenador.colorAleatorio();
        this.formato = Ordenador.formatoAleatorio();
        this.teclado = new Teclado();
    }

    // Constructor
    public Ordenador(String formato, String color, Teclado teclado) {
        this.formato = formato;
        this.color = color;
        this.teclado = teclado;
    }

    // Getter y setters

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }


    //Color aleatorio

    public static String colorAleatorio(){
        int min = 0;
        int max = colores.length -1;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return colores[aleatorio];
    }

    // Formato aleatorio

    public static String formatoAleatorio(){
        int min = 0;
        int max = formatos.length -1;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return formatos[aleatorio];
    }
    
}
