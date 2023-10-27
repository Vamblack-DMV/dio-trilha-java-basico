public class Case1 {

    public static void main(String[] args) {
        //salario base maior que salario pretentido
        case1(2000.0, 1900.0);

        //salario base igual ao salario pretentido
        case1(2000.0, 2000.0);

        //salario base menor que salario pretentido
        case1(1900.0, 2000.0);
    }

    //Lógica para analisar o salário conforme informado
    static void case1 (double salarioBase, double salarioPretendido) {

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o Candidato");

        }else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para Candidato com contra proposta");
            
        }else {
            System.out.println("Aguardando Resultado dos demais Candidatos");
        }

    }
    
}
