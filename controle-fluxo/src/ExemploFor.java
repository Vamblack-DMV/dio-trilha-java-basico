public class ExemploFor {

    //Estrutura 1
    public static void main(String[] args) {
        
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos ++){
            System.out.println(carneirinhos + " Carneirinho (s)");
        }

        System.out.println("Joãozinho dormiu!");

        //Estrutura 2
        int carneirinho = 1;
        for (; carneirinho <= 20 ;){
            System.out.println(carneirinho + " - Carneirinho (s)");
            carneirinho ++;
        }
    }
}