public class Operadores {

    public static void main(String[] args) {
        
        //classe operadores.java (Atribuição)

        String nome = "DAVID";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        //Date dataNascimento = new Date();

        //classe operadores.java (Aritméticos)

        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        //double resultado = (10 * 7) + (20 / 4);

        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);

        //qual o resultado das expressões abaixo?
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";

        System.out.println(concatenacao);
        
        concatenacao = 1 + "1" + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);

        System.out.println(concatenacao);

        //classe operadore.java (Unários)
        int numero = 5;

        //imprimindo número negativo
        System.out.println(- numero);

        //incrementando numero em mais 1 número, imprime 6
        numero ++;

        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++); //ops algo de errado não está certo

        System.out.println(numero);

        //ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);

        //clase operadores.java (Ternário)
        int a, b;

        a = 5;
        b = 6;

        /*
         * EXEMPLO DE CONDICIONAL UTILIZNADO UMA ESTRUTURA IF / ELSE
         */
        // if (a==b)
        //     resultado = "verdadeiro";
        // else
        //     resultado = "false";

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a == b) ? "verdadeiro" : "false";

        System.out.println(resultado);

        //classe operadores.java (Relacionais)
        int numero1 = 1;
        int numero2 = 2;

        if (numero1 > numero2)
            System.out.println("Número 1 maior que número 2");
            
        if (numero1 < numero2)
            System.out.println("Número 1 menor que número 2");

        if (numero1 >= numero2)
            System.out.println("Número 1 maior ou igual ao número 2");

        if (numero1 <= numero2)
            System.out.println("Número 1 menor ou igual ao número 2");

        if (numero1 != numero2)
            System.out.println("Número 1 é diferente do número 2");

        //classe Operadores.java (Operadores Lógicos)
        boolean condicao1 = true;
        
        boolean condicao2 = false;

        /* Aqwui estamos utilizando operador lógico E para fazer a união de duas expressões
        * É como se estivesse escrito:
        * "Se condicao1 e condicao2 forem verdadeiras, executar código"
        */

        if (condicao1 && condicao2)
            System.out.println("Os dois valores precisam ser verdadeiros");

        //Se condicao1 ou condicao2 for verdadeira, executar código
        if (condicao1 || condicao2)
            System.out.println("Um dos valores precisa ser verdadeiro");

    }
}