/*
NOME: Esther Araujo Carreiro
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

import java.util.Scanner;

public class Q403 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Inserir dados do funcionário");
            System.out.println("2. Alterar dados do funcionário");
            System.out.println("3. Recuperar dados do funcionário");
            System.out.println("4. Aplicar reajuste no salário");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    // Inserir dados do funcionário
                    System.out.print("Digite o nome do funcionário: ");
                    funcionario.setNome(scanner.nextLine());

                    System.out.print("Digite o cargo do funcionário: ");
                    funcionario.setCargo(scanner.nextLine());

                    System.out.print("Digite o salário atual do funcionário: ");
                    funcionario.setSalario(scanner.nextDouble());
                    break;

                case 2:
                    // Alterar dados do funcionário
                    System.out.print("Deseja alterar o nome do funcionário? (s/n): ");
                    if (scanner.nextLine().equalsIgnoreCase("s")) {
                        System.out.print("Digite o novo nome: ");
                        funcionario.setNome(scanner.nextLine());
                    }

                    System.out.print("Deseja alterar o cargo do funcionário? (s/n): ");
                    if (scanner.nextLine().equalsIgnoreCase("s")) {
                        System.out.print("Digite o novo cargo: ");
                        funcionario.setCargo(scanner.nextLine());
                    }

                    System.out.print("Deseja alterar o salário do funcionário? (s/n): ");
                    if (scanner.nextLine().equalsIgnoreCase("s")) {
                        System.out.print("Digite o novo salário: ");
                        funcionario.setSalario(scanner.nextDouble());
                    }
                    break;

                case 3:
                    // Recuperar dados do funcionário
                    System.out.println("\nDados do Funcionário:");
                    exibirDadosFuncionario(funcionario);
                    break;

                case 4:
                    // Aplicar reajuste
                    System.out.print("Digite o percentual de reajuste: ");
                    double percentual = scanner.nextDouble();
                    double novoSalario = funcionario.aplicarReajuste(percentual);
                    System.out.println("Novo Salário após reajuste: " + novoSalario);
                    break;

                case 5:
                    // Sair
                    continuar = false;
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void exibirDadosFuncionario(Funcionario funcionario) {
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário Atual: " + funcionario.getSalario());
    }
}

class Funcionario {
    // Atributos
    private String nome;
    private String cargo;
    private double salario;

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Aplicar reajuste e retornar novo salário
    public double aplicarReajuste(double percentual) {
        double reajuste = salario * (percentual / 100);
        salario += reajuste; // Salário com o novo valor
        return salario; // Retorna o novo salário
    }
}
