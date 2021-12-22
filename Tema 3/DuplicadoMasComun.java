public class DuplicadoMasComun {
    public static void main(String[] args) {
        
        int Matriz[][] = {{20,20,8},{40,10,8},{40,120,20}};

        int Repetido = 0;
        
        int numero = 0;
        
        int contadorA = 0 , contadorB = 0 ;
       
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                for (int j2 = 0; j2 < Matriz.length; j2++) {
                    
                }
                 
               if ( Matriz[i][j] == Matriz[i][j] ) {
                    
                   Repetido++;
                    
                   numero =  Matriz[i][j];
          
                   
               }
   
           }
            
       }
        
       
         System.out.println("el número que mas veces se repite es: " + numero + " y se repite " + Repetido + " veces " );
    }
}
