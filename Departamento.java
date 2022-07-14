import java.util.Scanner;

public class Departamento {
   String nome, responsavel, codigo;

   Scanner i = new Scanner (System.in);
    
    Departamento(){
        System.out.println("\n------------------------ Dados do Departamento -------------------------");
        System.out.println("\nInforme o código:");
        codigo = i.nextLine();
        System.out.println("\nInforme o nome do departamento:");
        nome = i.nextLine();
        System.out.println("\nInforme o responsavel:");
        responsavel = i.nextLine();
    }
    
    void dados(){
        System.out.println("\n------------------------------------------------------------------------");
        System.out.println("O codigo do departamento é "+codigo);
        System.out.println("O nome é "+nome);
        System.out.println("O responsavel pelo departamento é "+responsavel);
    }
    
    
}
