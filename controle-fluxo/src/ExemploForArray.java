public class ExemploForArray {
    
    public static void main(String[] args) {
        
        //Em arrays o índice inicia-se em ZERO
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x = 0 ; x < alunos.length ; x ++){
            System.out.println("O aluno no índice X = " + x + " é " + alunos[x]);
        }

        //Forma abreviada
        for (String aluno : alunos){
            System.out.println("O nome do aluno é " + aluno);
        }
    }
}
