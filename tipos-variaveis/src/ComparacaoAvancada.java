public class ComparacaoAvancada {

    public static void main(String[] args) {
        
        //classe ComparacaoAvancada.java (Valor e Referência)
        String nome1 = "JAVA";
        String nome2 = "JAVA";
    
        System.out.println(nome1 == nome2); //true

        String nome3 = new String("JAVA");

        System.out.println(nome1 == nome3); //false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); //true

        //equals na parada
        System.out.println(nome1.equals(nome2));
        System.out.println(nome2.equals(nome3));
        System.out.println(nome3.equals(nome4));

        //classe ComparacaoAvancada.java (equals)
        int numero1 = 130;
        int numero2 = 130;

        System.out.println(numero1 == numero2); //true

        Integer num1 = 130;
        Integer num2 = 130;

        System.out.println(num1 == num2); //false

        /*A razão pela qual o resultado é false, é devido o Java tratar os valores
         * Como objetos a partir de agora.
         * Qual a solução?
         * Quando queremos comparar objetos, usamos o método equals
        */
        System.out.println(num1.equals(num2));

        int numero3 = 1;
        int numero4 = 1;

        if (numero3 == 2 & numero4 ++ == 2)
            System.out.println("As 2 condições são verdadeiras");

        System.out.println("O número 3 agora é " + numero3);
        System.out.println("O número 4 agora é " + numero4);

        //Vamos mudar a linha 5 do código acima para: if(numero3 ==2 && numero4 ++ == 2)
        if (numero3 ==2 && numero4 ++ == 2)
            System.out.println("As 2 condições são verdadeiras");

        System.out.println("O número 3 agora é " + numero3);
        System.out.println("O número 4 agora é " + numero4);
    
    }
    
}
