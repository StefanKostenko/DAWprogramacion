public class Teclado {
    
    private static String [] colores = {"Negro" , "Blanco" , "Rojo" , "Azul" , "Gris" };
    private static String [] conectividades = {"Inalambrico" , "Por cable"};
    private static String [] idiomas = {"EN" , "ES" , "FR" , "RU" , "ZH"};
    private static String [] formatos = {"compacto" , "extendido"};

    private static final int NUMTECLAS_MIN = 65;
    private static final int NUMTECLAS_MAX = 150;

    // Atributos

    private String color;
    private int numeroDeTeclas;
    private String conectividad;
    private String idioma;
    private String formato;

    // Contador
    
    private static int contador = 0;


    // Constructor vacio

    public Teclado(){
        this.color = Teclado.colorAleatorio();
        this.numeroDeTeclas = Teclado.numDeTeclasAleatorio();
        this.conectividad = Teclado.conectividadAleatorio();
        this.formato = Teclado.formatoAleatorio();
        this.idioma =  Teclado.idiomaAleatorio();
        this.contador++; 
    }

    // Constructor

    public Teclado(String color, int numeroDeTeclas, String conectividad, String idioma, String formato) {
        this.color = color;
        
        // numero de teclas 
        if(numeroDeTeclas < 65){
            this.numeroDeTeclas = 65;
        }else if(numeroDeTeclas > 150){
            this.numeroDeTeclas = 150;
        }else{
            this.numeroDeTeclas = numeroDeTeclas;
        }
        
        // conectividad por defecto viene "por cable"
        if(conectividad == conectividades[0]|| conectividad == conectividades[1]){
            this.conectividad = conectividad;
        }else{
            this.conectividad = conectividades[1];
        }
        
        // Idiomas por defecto viene el "ES"
        if(idioma.length() == 2){
            this.idioma = idioma;
        }else{
            this.idioma = "ES";
        }

        // Formato por defecto es "extendido"
        if(formato == formatos[0] || formato == formatos[1]){
            this.formato = formato;
        }else{
            this.formato = "extendido";
        }

        this.contador++;
    }
        
    // Getters
    public String getColor() {
        return color;
    }

    public int getNumeroDeTeclas() {
        return numeroDeTeclas;
    }

    public String getConectividad() {
        return conectividad;
    }

    public String getIdioma() {
        return idioma;
    }
    
    public String getFormato() {
        return formato;
    }

    public int getContador() {
        return contador;
    }

    // Color aleatorio

    public static String colorAleatorio(){
        int min = 0;
        int max = colores.length -1;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return colores[aleatorio];
    }

    // Numero de teclas aleatorio

    public static int numDeTeclasAleatorio(){
        int min = Teclado.NUMTECLAS_MIN, max = Teclado.NUMTECLAS_MAX;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return aleatorio;
    }

    // Conectividad Aleatorio

    public static String conectividadAleatorio(){
        int min = 0;
        int max = conectividades.length -1;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return conectividades[aleatorio];
    }

    // Formato Aleatorio

    public static String formatoAleatorio(){
        int min = 0;
        int max = formatos.length -1;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return formatos[aleatorio];
    }

    // Idioma Aleatorio

    public static String idiomaAleatorio(){
        int min = 0;
        int max = idiomas.length -1;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return idiomas[aleatorio];
    }

    // Imprimir contador

    public static void mostrarContador(){
        System.out.println("Cantidad de teclados creados: " + contador);
    }
    
}
