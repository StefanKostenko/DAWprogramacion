import java.awt.Point;

public class Silla {

    private static final int CORRDENADA_MIN = 0;
    private static final int CORRDENADA_MAX = 100;
    private static final int NUMPATAS_MIN = 1;
    private static final int NUMPATAS_MAX = 4;
    private static final int COMODIDAD_MIN = 0;
    private static final int COMODIDAD_MAX = 10;

    
    private static String [] colores = {"azul " , "rojo " , "amarillo " , "negro "};
    private static String [] materiales = {"madera " , "metal " , "plastico "}; 

    // atributos de silla

    private String color;
    private int numeroDePatas;
    private boolean respaldo;
    private int comodidad;
    private Point cordenadas;
    private String material;

    public Silla(){
        // Generar silla aleatoria
        this.color = Silla.colorAleatorio();
        this.material = Silla.materialAleatorio();
        this.numeroDePatas = Silla.numPatasAleatorio();
        this.respaldo = Silla.respaldoAleatorio();
        this.comodidad = Silla.comodidadAleatorio();
        this.cordenadas = Silla.cordenadasAleatorio();
    }

    public Silla(String color, int numeroDePatas, boolean respaldo, int comodidad, Point cordenadas, String material) {
        this.color = color;
        this.numeroDePatas = numeroDePatas;
        this.respaldo = respaldo;
        this.comodidad = comodidad;
        this.cordenadas = cordenadas;
        this.material = material;
    }

    public static Point cordenadasAleatorio(){
        Point punto = new Point();

        int min = Silla.CORRDENADA_MIN;
        int max = Silla.CORRDENADA_MAX;

        int x = (int) (Math.random() * (max - min + 1) + min);
        int y = (int) (Math.random() * (max - min + 1) + min);

        punto.setLocation(x, y);
        return punto;
    }

    public static boolean respaldoAleatorio(){
        int min = 0, max = 1;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        if(aleatorio == 0){
            return false;
        }else{
            return true;
        }
    }

    public static int numPatasAleatorio(){
        int min = Silla.NUMPATAS_MIN, max = Silla.NUMPATAS_MAX;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return aleatorio;
    }

    public static int comodidadAleatorio(){
        int min = Silla.COMODIDAD_MIN, max = Silla.COMODIDAD_MAX;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return aleatorio;
    }

	public static String colorAleatorio() {
		int min = 0;
        int max = colores.length -1;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return colores[aleatorio];
	}

    public static String materialAleatorio() {
		int min = 0;
        int max = materiales.length -1;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return materiales[aleatorio];
	}

    //Getters

    public int getComodidada() {
        return comodidad;
    }

    public String getColor() {
        return color;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public String getRespaldo() {
        if(respaldo){
            return "Sí";
        }else{
            return "No";
        }
    }

    public String getMaterial() {
        return material;
    }

    public Point getCordenadas() {
        return cordenadas;
    }

    //Setters

    public void setComodidad(int comodidad) {
        if(comodidad < 0){
            this.comodidad = 0;
        }else if(comodidad > 10){
            this.comodidad = 10;
        }else{
            this.comodidad = comodidad;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        if(numeroDePatas < 0){
            this.numeroDePatas = 0;
        }else if(numeroDePatas > 100){
            this.numeroDePatas = 100;
        }else{
            this.numeroDePatas = numeroDePatas;
        }
    }

    public void setRespaldo(boolean respaldo) {
        this.respaldo = respaldo;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCordenadas(Point cordenadas) {
        this.cordenadas = cordenadas;
    }

}
