public class ArgumentosSuma {
    public static void main(String[] args) {
        int resultado = 0;
        System.out.println("Argumentos" + args.length);

        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);

            resultado += num;
        }
        System.out.println(resultado);
    }
}