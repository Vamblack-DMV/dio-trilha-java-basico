public class ExemploBreakContinue {
    
    public static void main(String[] args) {
        
        for (int numero = 1 ; numero <= 5 ; numero ++){
            if (numero == 3)
                break; //imprimi somente 1 e 2
                // continue; //somente não imprime o 3
            
            System.out.println(numero);
        }
    }
}
