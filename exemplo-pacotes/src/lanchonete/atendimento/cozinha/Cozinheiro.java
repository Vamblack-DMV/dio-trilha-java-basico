package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
    //pode ser default
    public void adicionarLancheNoBalcao () {
        System.out.println("Adicionado Lanche Natural Hambúrguer no Balcão");
    }

    //pode ser default
    public void adicionarSucoNoBalcao () {
        System.out.println("Adicionado Suco No Balcão");
    }

    //pode ser default
    public void adicionarComboNoBalcao () {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche () {
        System.out.println("Preparando Lanche Tipo Hambúrguer");
    }

    private void prepararVitamina () {
        System.out.println("Preparando Suco");
    }

    private void prepararCombo () {
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche () {
        System.out.println("Selecionando o Pão, Salada, Ovo e Carne");
    }

    private void selecionarIngredientesVitamina () {
        System.out.println("Selecionando Fruta, Leite e Suco");
    }

    private void lavarIngredientes () {
        System.out.println("Lavando Ingredientes");
    }

    private void baterVitaminaLiquidificador () {
        System.out.println("Batendo Vitamina No Liquidificador");
    }

    private void fritarIngredientesLanche () {
        System.out.println("Fritando a Carne e o Ovo Para o Hambúrguer");
    }

    private void pedirParaTrocarGas (Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes (Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}
