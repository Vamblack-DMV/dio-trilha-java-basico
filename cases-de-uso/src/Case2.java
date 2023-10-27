import java.util.concurrent.ThreadLocalRandom;

public class Case2 {

    public static void main(String [] args) {
        case2 ();
    }

    //Lógica para analisar candidatos
    static void case2 () {
        double salarioBase = 2000.0;
        //array com todos os candidatos
        String [] candidatos ={"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};
        int totalSelecionados = 0;
        int proximoCandidato = 0;

        while (totalSelecionados < 5 && proximoCandidato < candidatos.length) {
            String candidato = candidatos[proximoCandidato ++];
            double valorPretentido = valorPretentido();
            System.out.println("O Candidato " + candidato + " está pedindo R$" + valorPretentido);
            
            if (valorPretentido > salarioBase) {
                System.out.println("Que pena! O Candidato " + candidato + " NÃO foi selecionado");
            } else {
                System.out.println("Legal! O Candidato " + candidato + " foi selecionado");
                totalSelecionados ++;
            }
        }

        System.out.println("Total de Candidatos selecionados: " + totalSelecionados);
        System.out.println("Total de Candidatos consultados: " + proximoCandidato);
    }

    //Método para simular salário pretendido
    static double valorPretentido () {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    
}
