/**
 * Realizando os import o utilitário java.util que serão utilizados no momento da compilação e execução do código
 */
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scannwr: OK!
        //Exibir as mensagens para o nosso usuário: OK!
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada

        Scanner scanner =new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da sua Agência:");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua Conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite o seu nome completo:");
        String nome = scanner.next();

        System.out.println("Digite o saldo de depósito:");
        double saldo = scanner.nextDouble();

        System.out.println("Bom dia " + nome + ", obrigado por criar uma conta em nosso banco, sua Agência é " + agencia + ", conta " + conta + ", e seu saldo de" + saldo + ", já está disponível para saque.");

    }
}