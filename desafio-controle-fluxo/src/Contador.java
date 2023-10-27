import java.util.Scanner;
import java.util.Locale;

/**
 * Esse contador serve como compendio de todo o conteúdo abrangido até o presente momento.
 * <p>Ele irá receberá dois números do usuário e realizará a contagem dos números.
 */
public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        //Recebendo os números do usuário
        System.out.println("Digite o primeiro número");
        int primeiroNumero = terminal.nextInt();
        
        System.out.println("Digite o segundo número");
        int segundoNumero = terminal.nextInt();

        //Chamando a validação dos números
        try {
            contar(primeiroNumero,segundoNumero);

            //Determinando o início e a quantidade de contagem para impressão
            int contagem = segundoNumero - primeiroNumero;
            
            //Realizando a contagem e impressão dos números
            for (; contagem <= segundoNumero ;) {

                System.out.println("Imprimindo o número " + contagem);
                contagem ++;
            }

        } catch (ParametrosInvalidosException e) {
            System.out.println("O Primeiro número deve ser MENOR que o segundo");
        }

        terminal.close();
    }

    static void contar (int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        if (primeiroNumero >= segundoNumero) {
            throw new ParametrosInvalidosException();
        }
    }
}
