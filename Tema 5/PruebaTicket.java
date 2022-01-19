public class PruebaTicket {
    public static void main(String[] args) {
        TicketMachine t1 = new TicketMachine(100);
        t1.insertMoney(100);
        t1.insertMoney(200);
        t1.printTicket();
        t1.showPrice();
        t1.empty();
        t1.showPrice();
    }
}
