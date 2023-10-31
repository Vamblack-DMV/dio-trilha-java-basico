package escola;

public class Escola {

    // public static void main(String[] args) {
        
    //     Aluno felipe = new Aluno();
    //     felipe.nome = "Felipe";
    //     felipe.idade = 8;

    //     System.out.println("O Aluno " + felipe.nome + " tem " + felipe.idade + " anos");
    //     //resultado no console
    //     //O Aluno Felipe tem 8 ano
    // }
    
    public static void main(String[] args) {
        
        Aluno felipe = new Aluno();
        felipe.setNome ("Felipe");
        felipe.setIdade(8);

        System.out.println("O Aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos");
    }
}
