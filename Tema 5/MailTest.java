public class MailTest {
    public static void main(String[] args) {
        
        MailServer s1 = new  MailServer();
        MailClient c1 = new MailClient(s1, "Julio");
        MailClient c2 = new MailClient(s1, "Pepe");
        MailClient c3 = new MailClient(s1, "Ana");

        c1.sendMailItem("Julio;Pepe", "Hola", "Soy programador!");

        System.out.println(s1.howManyMailItems("Julio"));
        c1.printNextMailItem();

        System.out.println(s1.howManyMailItems("Pepe"));

        c2.forwedLastMailItem("Ana");
        System.out.println(s1.howManyMailItems("Ana"));
        c3.printNextMailItem();

    }
}
