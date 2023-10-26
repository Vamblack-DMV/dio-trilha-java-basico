/**
 * Realizando os import o utilitário java.util que serão utilizados no momento da compilação e execução do código
 */
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número e dígito da sua Agência:");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua Conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite o seu Nome:");
        String nome = scanner.next();

        System.out.println("Digite o seu Sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite o saldo de depósito:");
        double saldo = scanner.nextDouble();

        System.out.println("Bom dia " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua Agência é " + agencia + ", conta " + conta + ", e seu saldo de R$" + saldo + ", já está disponível para saque.");

    }
}