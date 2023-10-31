/*
 * Simulação de uso da classe MSNMessenger
 */

import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.TelegramMessenger;

public class ComputadorPedrinho {

    // //método inicial
    // public static void main(String[] args) {
        
    //     System.out.println("MSN");
    //     //Abrindo o MSN Messenger
    //     MSNMessenger msn = new MSNMessenger();

    //     //antes
    //     // msn.validarConectadoInternet();
    //     // msn.enviarMensagem();
    //     // msn.salvarHistoricoMensagem();

    //     //Depois
    //     msn.enviarMensagem();
    //     msn.receberMensagem();

    //     System.out.println("Facebook");
    //     FacebookMessenger fcb = new FacebookMessenger();
    //     fcb.enviarMensagem();
    //     fcb.receberMensagem();

    //     System.out.println("Telegram");
    //     TelegramMessenger tlg = new TelegramMessenger();
    //     tlg.enviarMensagem();
    //     tlg.receberMensagem();
    // }
    
    //método final
    public static void main(String[] args) {
        
        ServicoMensagemInstantanea smi = null;

        /*
         * Não se sabe qual App
         * mas qualquer um deverár enviar e receber mensagem
         */

         String appEscolhido = "msn";

         if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("tlg"))
            smi = new TelegramMessenger();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
