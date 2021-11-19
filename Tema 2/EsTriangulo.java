public class EsTriangulo {
    public static boolean esTriangulo(int a, int b, int c){
        boolean resultado = false;

        if(a>(b+c) ||  b>(a+c) || c>(a+b)){
            resultado = false;
        }else{
            resultado = true;
        }
        return resultado;
    }
    public static void main(String[] args) {
        System.out.println(esTriangulo(5, 4, 2));
        System.out.println(esTriangulo(17, 3, 1));
    }
}