import java.util.Scanner;

public class Endereco {
    
    String rua;
    String bairro;
    String cep;
    String cidade;
    int numCasa;
    
    Scanner x = new Scanner (System.in);
    Scanner y = new Scanner (System.in);
    
    Endereco (){
        System.out.println("------- Dados do endereco do funcionario -------");
        System.out.println("\nInforme o nome da rua:");
        rua = x.nextLine();
        System.out.println("\nInforme o nome do bairro:");
        bairro = x.nextLine();
        System.out.println("\nInforme o cep:");
        cep = x.nextLine();
        System.out.println("\nInforme o nome da cidade:");
        cidade = x.nextLine();
        System.out.println("\nInforme o numero da casa:");
        numCasa = y.nextInt();
    }
    void exibirDados (){
        System.out.println("O nome da rua é "+rua);
        System.out.println("O nome do bairro é "+bairro);
        System.out.println("O cep é "+cep);
        System.out.println("O nome da cidade é "+cidade);
        System.out.println("O número da casa é "+numCasa);
    }
}

