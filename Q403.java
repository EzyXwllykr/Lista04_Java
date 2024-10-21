/*
NOME: Esther Araujo Carreiro
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

import java.util.Scanner;

public class Q403 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar um objeto Funcionario
        Funcionario funcionario = new Funcionario();

        // Inserir dados do funcionário
        System.out.print("Digite o nome do funcionário: ");
        funcionario.setNome(scanner.nextLine());

        System.out.print("Digite o cargo do funcionário: ");
        funcionario.setCargo(scanner.nextLine());

        System.out.print("Digite o salário atual do funcionário: ");
        funcionario.setSalario(scanner.nextDouble());

        // Exibir os dados do funcionário
        System.out.println("\nDados do Funcionário:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário Atual: " + funcionario.getSalario());

        // Aplicar reajuste
        System.out.print("Digite o percentual de reajuste: ");
        double percentual = scanner.nextDouble();
        double novoSalario = funcionario.aplicarReajuste(percentual);
        System.out.println("Novo Salário após reajuste: " + novoSalario);

        scanner.close();
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
