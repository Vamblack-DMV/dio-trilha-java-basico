public class ResultadoEscola {

    public static void main(String[] args) throws Exception {
        
        //Sistema IF / ELSE encadeada
        int nota = 6;

        if (nota >= 7)
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");

        else
            System.out.println("Reprovado");

        //Sistema IF / ELSE encadeada Ternaria
        int nota1 = 7;

        String resultado = nota1 >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        int nota2 = 6;

        String resultado1 = nota2 >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado1);
    }
}
