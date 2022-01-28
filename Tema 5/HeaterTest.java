public class HeaterTest {
    public static void main(String[] args) {
        Heater h1;

        h1 = new Heater(10.0, 0, 30.0);

        h1.cooler();
        h1.setIncrement(3.0);
        h1.warmer();
        h1.warmer();
        h1.cooler();
        h1.printTemperature();
    }
}
