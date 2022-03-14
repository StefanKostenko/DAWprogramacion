package Forma;

public class Test{
    public static void main(String[] args) {
        Forma f1 = new Forma("negro", 1, 1, "f1");

        Rectangulo r1 = new Rectangulo("rojo", 2, 2, "Rectangulo1", 10, 10);

        f1.Imprimir();
        f1.mover(7, 8);
        f1.Imprimir();
        f1.setColor("amarillo");
        f1.Imprimir();

        r1.Imprimir();
        r1.mover(2, 2);
        r1.Imprimir();
        r1.areaRectangulo();
        r1.cambiarTamaño(0.5);
        r1.Imprimir();
        r1.perímetro();

        Cuadrado c1 = new Cuadrado("negro", 2, 2, "cuadrado", 10);
        c1.areaCuadrado();
        c1.Imprimir();
    }
}
