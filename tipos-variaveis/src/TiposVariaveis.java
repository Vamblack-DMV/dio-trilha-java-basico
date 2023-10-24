public class TiposVariaveis {

    public static void main(String[] args) throws Exception {
        
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; //se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; //se começar com zero, talvez tenha que ser outro tipo
        double salario = 1275.33;

        //TiposEVariaveis.java

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //realizando o cast para o short aceitar a informação int

        /*
         * esta linha é considerada como declaração de variável iniciamos a existência
         * variavel numero com valor 5 regra: tipo + nome + valor
         */

         int numero = 5;

         /*
          * esta linha abaixo iremos alterar o valor variável para 10 observe o tipo
          não é mais necessário, pois a variável já foi declarada anteriormente
          */

          numero = 10;

          System.out.print (numero);

          /*
           * ao usar a palavra reservada final, você determina jamais
           * esta variavel poderá obter outro valor;
           * logo a linha 25 vai apresentar um erro de compilação
           * isso é considerado uma CONSTANTE na linguagem Java
           */

           final double VALOR_DE_PI = 3.14;

           //VALOR_DE_PI =3.15; //esta linha vai apresentar erro de compilação

    }

}
