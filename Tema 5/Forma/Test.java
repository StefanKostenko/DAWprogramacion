package Forma;

import java.util.ArrayList;

public class Test{
    public static void main(String[] args) {
        Forma f1 = new Forma("negro", 1, 1, "f1");

        Rectangulo r1 = new Rectangulo("rojo", 2, 2, "Rectangulo1", 10, 10);

        Cuadrado c1 = new Cuadrado("negro", 2, 2, "Cuadrado1", 10);

        Elipse e1 = new Elipse("azul", 4, 2, "Elipse1", 10, 7);

        Circulo ci1 = new Circulo("blanco", 3, 3, "Circulo1", 5);

        ArrayList<Forma> Objetos = new ArrayList<>();

        Objetos.add(r1);
        Objetos.add(c1);
        Objetos.add(e1);
        Objetos.add(ci1);

        for (Forma itemForma : Objetos) {
            itemForma.setColor("negro");
            itemForma.mover(2, 2);
            itemForma.Imprimir();
        }
    }
}
