public class MSNMessenger {

    public void enviarMensagem () {
        //primeiro confirmar se está conectado a internet
        validarConectadoInternet();

        System.out.println("Enviando mensagem");

        //depois de enviada, salva o histórico da mensagem.
        salvarHistoricoMensagem();
    }

    public void receberMensagem () {
        System.out.println("Recebendo mensagem");
    }

    //métodos privados, visíveis somente na classe
    private void validarConectadoInternet () {
        System.out.println("Validando se está conectado na internet");
    }
    
    private void salvarHistoricoMensagem () {
        System.out.println("Salvando histórico da mensagem");
    }
}
