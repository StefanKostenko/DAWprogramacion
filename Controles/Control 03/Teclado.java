public class Teclado {
    
    private static String [] colores = {"Negro" , "Blanco" , "Rojo" , "Azul" , "Gris" };
    private static String [] conectividades = {"Inalambrico" , "Por cable"};
    private static String [] idiomas = {"[EN]" , "[ES]" , "[FR]" , "[RU]" , "[ZH]"};
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
    
    private static int contador;


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
        this.numeroDeTeclas = numeroDeTeclas;
        this.conectividad = conectividad;
        this.idioma = idioma;
        this.formato = formato; 
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

    // Setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setNumeroDeTeclas(int numeroDeTeclas) {
        if(numeroDeTeclas < 65){
            this.numeroDeTeclas = 65;
        }else if(numeroDeTeclas > 150){
            this.numeroDeTeclas = 150;
        }else{
            this.numeroDeTeclas = numeroDeTeclas;
        }
    }

    public void setConectividad(String conectividad) {
        this.conectividad = conectividad;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setContador(int contador){
        this.contador = 0;
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
        System.out.println("Cantidad de teclados creados: " + Teclado.contador);
    }
    
}
