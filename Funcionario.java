import java.util.Scanner;

public class Funcionario {
    String nome, cpf, telefone, genero, funcaoEmpresa, datadmissao;
    Endereco endereco;
    Departamento departamento;
    float vendas, tot;
    float pag;
    boolean contratado = true;

    Scanner ler = new Scanner(System.in);
    Scanner l = new Scanner(System.in);
    int hextra;

    Funcionario() {
        System.out.println(" ---------- Dados Dos Funcionarios ----------");
        System.out.println("\nDigite o nome do funcionario: ");
        nome = l.nextLine();
        System.out.println("\nDigite o CPF do funcionario:");
        cpf = ler.nextLine();
        System.out.println("\nDigite o numero de telefone do funcionario:");
        telefone = ler.nextLine();
        System.out.println("\nDigite o genero do funcionario:");
        genero = ler.nextLine();
        System.out.println("\nDigite a funcao do funcionario");
        System.out.println("Funcoes: vendedor, naovendedor e supervisor");
        funcaoEmpresa = l.nextLine();
        System.out.println("\nDigite a data de admissao do funcionario:");
        datadmissao = ler.nextLine();

        if(funcaoEmpresa.equalsIgnoreCase("vendedor")){
            System.out.println("\nDigite o valor vendido pelo funcionario nesse mes:");
            vendas = ler.nextFloat();

        }else if(funcaoEmpresa.equalsIgnoreCase( "naovendedor")){
            System.out.println("\nDigite as horas extras feitas pelo funcionario:");
            hextra = ler.nextInt();

        }else if(funcaoEmpresa.equalsIgnoreCase( "supervisor")){
            System.out.println("\nDigite as horas extras feitas pelo funcionario:");
            hextra = ler.nextInt();
        }
        
        endereco = new Endereco();
        departamento = new Departamento();
        System.out.println("--------------------------------------------------------");

    }

    float calculoPagamento() {
        float salarioMin = 1250f;
        if (funcaoEmpresa.equalsIgnoreCase("vendedor")) {
            if (vendas <= 2000) {
                pag = salarioMin;

            } else if (vendas >= 2001 && vendas <= 5000) {
                pag = salarioMin + (vendas * 2) / 100;

            } else if (vendas > 5000) {
                pag = salarioMin + (vendas * 3) / 100;

            }
        }

        if (funcaoEmpresa.equalsIgnoreCase("naovendedor")) {
            pag = salarioMin + (50 * hextra);

        }

        if (funcaoEmpresa.equalsIgnoreCase("supervisor")) {
            pag = salarioMin + (50 * hextra) + 500;
        }
        return pag;
    }

    void mostrarDados() {
        System.out.println("O nome do funcionario e " + nome);
        System.out.println("O CPF do funcionario CPF e " + cpf);
        System.out.println("O telefone do funcionario e " + telefone);
        System.out.println("O genero do funcionario é " + genero);
        System.out.println("A funcao do funcionario na empresa é " + funcaoEmpresa);
        System.out.println("O funcionario foi contratado em " + datadmissao);
        System.out.println("O salario do funcionario e R$ " + pag);
        System.out.println("\n-----------------------------------------------------------");
        System.out.println("\n------------ Informacoes sobre o endereco do funcionario -------------");
        endereco.exibirDados();
        System.out.println("\n------------------------ Dados de departamento -------------------------");
        departamento.dados();
        System.out.println("\n------------------------------------------------------------------------");
    }

    void mudarFuncao(){
        System.out.println("\nQual a nova funcao do funcinario?");
        funcaoEmpresa = l.nextLine();
        System.out.println("\nX funcionarix "+nome+" mudou para a funcao "+funcaoEmpresa+" .");
    }

    void demitir(){
        contratado = false;
        System.out.println("\nX funcionarix "+nome+" está demitido");
    }
}
