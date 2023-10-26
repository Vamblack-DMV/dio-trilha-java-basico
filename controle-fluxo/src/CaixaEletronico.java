public class CaixaEletronico {

    public static void main(String[] args) {
        
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo){      

            saldo = saldo - valorSolicitado;
            System.out.println("Novo Saldo: R$" + saldo);

            //Caso não tenha saldo será passado para a linha abaixo
        }else
            System.out.println("Saldo Insuficiente");
    }
}