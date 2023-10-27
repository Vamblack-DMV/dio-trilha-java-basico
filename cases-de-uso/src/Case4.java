import java.util.Random;

public class Case4 {
    
    public static void main(String[] args) {
        //Array de candidatos selecionados e for para escolher os candidatos
        String [] candidatosSelecionados = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO"};
        for (String candidato : candidatosSelecionados) {
            case4 (candidato);
        } 
    }
    //Lógica para realizar as ligações para os candidatos selecionados
    static void case4 (String candidato) {
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
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        else
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas " + tentativasRealizadas + " realizadas");
    }

    //Método para simular os toques de chamada telefônica
    static boolean atender() {
        return new Random().nextInt (3) == 1;
    }
}

