public class PruebaTicket {
    public static void main(String[] args) {
        TicketMachine t1 = new TicketMachine();
        t1.setPrice(72);
        t1.insertMoney(100);
        t1.printTicket();
        t1.empty();
        t1.showPrice();
    }
}
