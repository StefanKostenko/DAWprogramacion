public class ClockDisplayTest {
    public static void main(String[] args) {
        ClockDisplay reloj;

        reloj = new ClockDisplay(22, 52, 55);

        reloj.timeTick();
        reloj.getTime();
    }
}
