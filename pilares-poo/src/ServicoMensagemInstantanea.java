public class ServicoMensagemInstantanea {
    public void enviarMensagem () {
        
        //primeiro confirma se está conectado a internet
        validarConectadoInternet ();
        System.out.println("Enviando Mensagem");

        //depois de enviada, salva o histórico da mensagem
        salvarHistoricoMensagem ();
    }

    public void receberMensagem () {
        System.out.println("Recebendo Mensagem");
    }

    //métodos privados, visíveis somente na classe
    private void validarConectadoInternet () {
        System.err.println("Validando se está conectado na internet");
    }

    private void salvarHistoricoMensagem () {
        System.out.println("Salvando o histórico da mensagem");
    }
}
