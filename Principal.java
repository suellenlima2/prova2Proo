/* @author Suellen Lima Da Silva
 * @author Jaiane Da Silva Correia
 */

import java.util.Scanner;

public class Principal {
   public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      Scanner i = new Scanner(System.in);

      String resp = "sim";
      int r;
      float tot = 0;
      String nome = " ";

      System.out.println("\n------------------------ Dados do funcionario 1 ------------------------");
      Funcionario f1 = new Funcionario();
      f1.calculoPagamento();

      System.out.println("\n------------------------ Dados do funcionario 2 ------------------------");
      Funcionario f2 = new Funcionario();
      f2.calculoPagamento();

      System.out.println("\n------------------------ Dados do funcionario 3 ------------------------");
      Funcionario f3 = new Funcionario();
      f3.calculoPagamento();

      System.out.println("\n------------------------ Dados do funcionario 4 ------------------------");
      Funcionario f4 = new Funcionario();
      f4.calculoPagamento();

      System.out.println("\n------------------------ Dados do funcionario 5 ------------------------");
      Funcionario f5 = new Funcionario();
      f5.calculoPagamento();

      System.out.println("\n-------------------- Exibindo dados do funcionario 1 -------------------");
      f1.mostrarDados();

      System.out.println("\n-------------------- Exibindo dados do funcionario 2 -------------------");
      f2.mostrarDados();

      System.out.println("\n-------------------- Exibindo dados do funcionario 3 -------------------");
      f3.mostrarDados();

      System.out.println("\n-------------------- Exibindo dados do funcionario 4 -------------------");
      f4.mostrarDados();

      System.out.println("\n-------------------- Exibindo dados do funcionario 5 -------------------");
      f5.mostrarDados();

      do {
         System.out.println("--------------------------------- MENU ------------------------------------");
         System.out.println("1 - Exibir quanto a empresa vai pagar por todos os funcionários cadastrados");
         System.out.println("2 - Mudar a função de um determinado funcionário (perguntar o nome)");
         System.out.println("3 - Demitir funcionário.");
         System.out.println("---------------------------------------------------------------------------");
         System.out.println("\nDigite a opcao que deseja executar:");
         r = ler.nextInt();

         if (r == 1) {
            if (f1.contratado == true) {
               tot = tot + f1.calculoPagamento();
            }
            if (f2.contratado == true) {
               tot = tot + f2.calculoPagamento();
            }
            if (f3.contratado == true) {
               tot = tot + f3.calculoPagamento();
            }
            if (f4.contratado == true) {
               tot = tot + f4.calculoPagamento();
            }
            if (f5.contratado == true) {
               tot = tot + f5.calculoPagamento();
            }

            System.out.println("\nO total a pagar por todos os funcionarios cadastrados e: " + tot);
            tot = 0;

         } else if (r == 2) {
            System.out.println("LISTA DE FUNCIONARIOS:");

            if (f1.contratado == true) {
               System.out.println(f1.nome);
            }

            if (f2.contratado == true) {
               System.out.println(f2.nome);
            }

            if (f3.contratado == true) {
               System.out.println(f3.nome);
            }

            if (f4.contratado == true) {
               System.out.println(f4.nome);
            }

            if (f5.contratado == true) {
               System.out.println(f5.nome);
            }

            System.out.println("\nQual o nome do funcionario que deseja mudar a função?");
            nome = i.nextLine();

            if (nome.equalsIgnoreCase(f1.nome)) {
               System.out.println("\nA funcao atual dx funcionarix " + f1.nome + " é " + f1.funcaoEmpresa);
               f1.mudarFuncao();

            } else if (nome.equalsIgnoreCase(f2.nome)) {
               System.out.println("\nA funcao atual dx funcionarix " + f2.nome + " é " + f2.funcaoEmpresa);
               f2.mudarFuncao();

            } else if (nome.equalsIgnoreCase(f3.nome)) {
               System.out.println("\nA funcao atual dx funcionarix " + f3.nome + " é " + f3.funcaoEmpresa);
               f3.mudarFuncao();

            } else if (nome.equalsIgnoreCase(f4.nome)) {
               System.out.println("\nA funcao atual dx funcionarix " + f4.nome + " é " + f4.funcaoEmpresa);
               f4.mudarFuncao();

            } else if (nome.equalsIgnoreCase(f5.nome)) {
               System.out.println("\nA funcao atual dx funcionarix " + f5.nome + " é " + f5.funcaoEmpresa);
               f5.mudarFuncao();

            } else {
               System.out.println("\nFuncionario não cadastrado!");
            }

         } else if (r == 3) {
            System.out.println("LISTA DE FUNCIONARIOS:");

            if (f1.contratado == true) {
               System.out.println(f1.nome);
            }

            if (f2.contratado == true) {
               System.out.println(f2.nome);
            }

            if (f3.contratado == true) {
               System.out.println(f3.nome);
            }

            if (f4.contratado == true) {
               System.out.println(f4.nome);
            }

            if (f5.contratado == true) {
               System.out.println(f5.nome);
            }
            System.out.println("\nQual o nome do funcionario que deseja demitir?");
            nome = i.nextLine();

            if (nome.equalsIgnoreCase(f1.nome)) {
               f1.demitir();

            } else if (nome.equalsIgnoreCase(f2.nome)) {
               f2.demitir();

            } else if (nome.equalsIgnoreCase(f3.nome)) {
               f3.demitir();

            } else if (nome.equalsIgnoreCase(f4.nome)) {
               f4.demitir();

            } else if (nome.equalsIgnoreCase(f5.nome)) {
               f5.demitir();

            } else {
               System.out.println("Funcionario nao cadastrado!!!");
            }
         }

         System.out.println("\nVoce deseja executar o MENU novamente?");
         System.out.println("sim | nao");
         resp = ler.next();
         if (resp.equalsIgnoreCase("nao")) {
            break;
         }
      } while (true);
   }
}
