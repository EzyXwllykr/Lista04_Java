/*
NOME: Esther Araujo Carreiro
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Q401 {
    private static ArrayList<Pessoa> pessoas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\nMenu de Cadastro de Pessoas");
            System.out.println("1. Inserir Pessoa");
            System.out.println("2. Alterar Dados da Pessoa");
            System.out.println("3. Consultar Dados da Pessoa");
            System.out.println("4. Excluir Pessoa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    inserirPessoa();
                    break;
                case 2:
                    alterarPessoa();
                    break;
                case 3:
                    consultarPessoa();
                    break;
                case 4:
                    excluirPessoa();
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);
    }

    public static void inserirPessoa() {
        System.out.print("Digite o ID da pessoa: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CPF da pessoa: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite a data de nascimento (YYYY-MM-DD): ");
        LocalDate dataNascimento = LocalDate.parse(scanner.nextLine());

        Pessoa novaPessoa = new Pessoa(id, nome, cpf, dataNascimento);
        pessoas.add(novaPessoa);
        System.out.println("Pessoa inserida com sucesso!");
    }

    public static void alterarPessoa() {
        System.out.print("Digite o ID da pessoa a ser alterada: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdPessoa() == id) {
                System.out.print("Digite o novo nome da pessoa: ");
                pessoa.setNomePessoa(scanner.nextLine());
                System.out.print("Digite o novo CPF da pessoa: ");
                pessoa.setCpfPessoa(scanner.nextLine());
                System.out.print("Digite a nova data de nascimento (YYYY-MM-DD): ");
                pessoa.setDataNascimento(LocalDate.parse(scanner.nextLine()));
                System.out.println("Dados da pessoa alterados com sucesso!");
                return;
            }
        }
        System.out.println("Pessoa não encontrada!");
    }

    public static void consultarPessoa() {
        System.out.print("Digite o ID da pessoa a ser consultada: ");
        int id = scanner.nextInt();

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdPessoa() == id) {
                System.out.println(pessoa);
                return;
            }
        }
        System.out.println("Pessoa não encontrada!");
    }

    public static void excluirPessoa() {
        System.out.print("Digite o ID da pessoa a ser excluída: ");
        int id = scanner.nextInt();

        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getIdPessoa() == id) {
                pessoas.remove(i);
                System.out.println("Pessoa excluída com sucesso!");
                return;
            }
        }
        System.out.println("Pessoa não encontrada!");
    }
}

class Pessoa {
    // Atributos
    private int idPessoa;
    private String nomePessoa;
    private String cpfPessoa;
    private LocalDate dataNascimento;

    // Construtor
    public Pessoa(int idPessoa, String nomePessoa, String cpfPessoa, LocalDate dataNascimento) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.cpfPessoa = cpfPessoa;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters
    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getCpfPessoa() {
        return cpfPessoa;
    }

    public void setCpfPessoa(String cpfPessoa) {
        this.cpfPessoa = cpfPessoa;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Exibir os dados da pessoa
    @Override
    public String toString() {
        return "Pessoa{" +
                "ID: " + idPessoa +
                ", Nome: '" + nomePessoa + '\'' +
                ", CPF: '" + cpfPessoa + '\'' +
                ", Data de Nascimento: " + dataNascimento +
                '}';
    }
}
