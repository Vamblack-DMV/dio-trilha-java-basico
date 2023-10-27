import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;

public class AboutMe {

    public static void main(String[] args) {

        try {
        //criando o objeto scanner
        Scanner scannner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scannner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scannner.next();

        System.out.println("Digite sua idade:");
        int idade = scannner.nextInt();

        System.out.println("Digite sua altura:");
        double altura = scannner.nextDouble();

        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");
        
        scannner.close();
        }

        catch (InputMismatchException e) {
            System.out.println("O campo idade deve ser númérico e o altura deve conter ponto no lugar de vígula");
        }
    }
    
}
