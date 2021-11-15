public class LetraDni {
    
    public static char letraDni(int dni){

        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        return letras[dni%23];
    }
    public static void main(String[] args) {
        System.out.println(letraDni(12345678));
    }
}
