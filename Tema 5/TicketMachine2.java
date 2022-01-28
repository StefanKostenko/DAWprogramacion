/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class TicketMachine2
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    private int discount;

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine2(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
        discount = 0;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = 20;
    }

    public void resetDiscount(){
        this.discount = 0;
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) {
            balance = balance + amount;
        }
        else {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        int realPrice = price * (100 - discount)/100;
        int amountToPay = realPrice - this.balance;

        if(amountToPay <= 0){
            System.out.println("####################################");
            System.out.println("#Billete pagado por precio: " + realPrice + " #");
            System.out.println("####################################");

            total = total + realPrice;

            balance = balance + realPrice;
        } else{
            System.out.println("Falta por pagar: " + amountToPay);
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }

    public int emptyMachine(){
        int totalGuardado = total;
        total = 0;
        return totalGuardado;
    }

}