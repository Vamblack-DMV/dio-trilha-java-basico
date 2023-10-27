public class Case3 {
    
    public static void main(String[] args) {
        case3();
    }

    //Lógica para realizar a impressão da lista de candidatos
    static void case3 () {
        String [] candidatosSelecionados ={"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO"};

        //Forma indexada
        //Quando precisa do índice para complementar a lógica
        System.out.println("Imprimindo com a ordem de selação pelo índice");

        for (int x = 0 ; x < candidatosSelecionados.length ; x ++) {
            System.out.println((x + 1) + "º Candidato é " + candidatosSelecionados [x]);
        }

        //Forma abreviada
        //Impressão total sem precisar da posição ou indice
        System.out.println("Imprimindo todos sem a necessidade de exibir o índice");

        for (String candidato : candidatosSelecionados) {
            System.out.println(candidato);
        }
    }
}
