import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        String [] candidatos ={"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO"};
        //primeiro um for para selecionar os candidatos
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);           
        }
    }

    static void imprimirSelecionados () {
        String [] candidatos ={"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        for (int indice =0 ; indice < candidatos.length ; indice ++) {
            System.out.println("O candidato de número " + (indice + 1) + " é " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void entrandoEmContato (String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas ++;
            else
                System.out.println("Contato realizado com sucesso");

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) 
            System.out.println("Conseguimos contato com "+ candidato + " na " + tentativasRealizadas + " tentativa");
        else
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas " + tentativasRealizadas + " realizadas");

    }

    static void selecaoCandidatos() {
        //Array com a lista de candidatos
        String [] candidatos ={"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretentido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário R$" + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados ++;
            }

            candidatoAtual ++;
        }

        System.out.println("Total de Candidatos Selecionados: " + candidatosSelecionados);
        System.out.println("Total de Candidatos Consultados: " + candidatoAtual);
    }

    //método que simula o valor pretendido
    static double valorPretentido () {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    //método para analisar o salario pretendido em relação ao salario base
    static void analisarCandidato(double salarioPretendido) {

        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");

        }else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");

        }else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    //método que simula o atendimento de ligação
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
}