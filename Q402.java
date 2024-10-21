/*
NOME: Esther Araujo Carreiro
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

import java.util.Scanner;

public class Q402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar um objeto Aluno
        Aluno aluno = new Aluno();

        // Dados do aluno
        System.out.print("Digite o nome do aluno: ");
        aluno.setNome(scanner.nextLine());

        System.out.print("Digite a nota do aluno: ");
        aluno.setNota(scanner.nextDouble());

        // Exibir os dados do aluno
        System.out.println("\nDados do Aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Nota: " + aluno.getNota());
        System.out.println("Conceito: " + aluno.getConceito());

        scanner.close();
    }
}

class Aluno {
    // Atributos
    private String nome;
    private double nota;

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // Retornar o conceito da nota
    public String getConceito() {
        if (nota >= 90) {
            return "A";
        } else if (nota >= 80) {
            return "B";
        } else if (nota >= 70) {
            return "C";
        } else if (nota >= 60) {
            return "D";
        } else {
            return "E";
        }
    }
}
