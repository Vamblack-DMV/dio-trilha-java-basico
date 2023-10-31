public class SistemaCadastro {

    public static void main(String[] args) {
        //criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa ("123.456.789-01", "Marcos");

        //definimos o endereço de marcos
        marcos.setEndereço("Rua das Marias");

        //e como definir o nome e cpf de marcos?

        //imprimindo o marcos sem o nome e cpf
        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
    
}
