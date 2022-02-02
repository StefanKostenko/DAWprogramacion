public class MailTest {
    public static void main(String[] args) {
        
        MailServer s1 = new  MailServer();
        MailClient c1 = new MailClient(s1, "Julio");
        MailItem m1 = new MailItem("Stefan", "Julio" , "Hola", "Soy programador!");

        m1.print();

        s1.post(m1);
        System.out.println(s1.howManyMailItems("Julio"));
        c1.printNextMailItem();

    }
}
