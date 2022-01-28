public class BookTest {
    public static void main(String[] args) {
        Book b1;

        b1 = new Book("Andres", "Hola", 120, true);

        b1.getRefNumber();
        b1.setRefNumber("sas1");
        b1.getRefNumber();
        b1.borrow();
        b1.printDetails();
    }
}
