/*
 * Simulação de uso da classe MSNMessenger
 */

public class ComputadorPedrinho {

    public static void main(String[] args) {
        
        //Abrindo o MSN Messenger
        MSNMessenger msn = new MSNMessenger();

        //antes
        // msn.validarConectadoInternet();
        // msn.enviarMensagem();
        // msn.salvarHistoricoMensagem();

        //Depois
        msn.enviarMensagem();
        msn.receberMensagem();
    }
    
}
