public class Ordenador {
    
    private static String [] colores = {"Negro" , "Blanco" , "Rojo" , "Azul" , "Gris" };
    private static String [] formatos = {"Sobremesa" , "Portatil"};

    // Atributos privados

    private String formato;
    private String color;
    private Teclado teclado;
    //Atributo que he creado para conectar el ordenador a otro
    private String conexion;

    // Constructor vacio

    public Ordenador(){
        this.color = Ordenador.colorAleatorio();
        this.formato = Ordenador.formatoAleatorio();
        this.teclado = new Teclado();
        this.conexion = 
    }

    // Constructor
    public Ordenador(String formato, String color, Teclado teclado) {
        
        if(formato == formatos[0] || formato == formatos[1]){
            this.formato = formato;
        }else{
            this.formato = "Sobremesa";
        }
        this.color = color;
        this.teclado = teclado;
    }

    // Getter

    public String getFormato() {
        return formato;
    }

    public String getColor() {
        return color;
    }

    public Teclado getTeclado() {
        return teclado;
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
