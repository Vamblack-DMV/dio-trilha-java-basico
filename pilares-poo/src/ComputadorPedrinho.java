/*
 * Simulação de uso da classe MSNMessenger
 */

public class ComputadorPedrinho {

    public static void main(String[] args) {
        
        System.out.println("MSN");
        //Abrindo o MSN Messenger
        MSNMessenger msn = new MSNMessenger();

        //antes
        // msn.validarConectadoInternet();
        // msn.enviarMensagem();
        // msn.salvarHistoricoMensagem();

        //Depois
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("Facebook");
        FacebookMessenger fcb = new FacebookMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println("Telegram");
        TelegramMessenger tlg = new TelegramMessenger();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
    
}
