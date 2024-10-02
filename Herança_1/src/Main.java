import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dados da pessoa fisica
        System.out.println("Digite os dados da Pessoa Física:");
        System.out.print("Nome: ");
        String nomePF = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfPF = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoPF = scanner.nextLine();
        System.out.print("Email: ");
        String emailPF = scanner.nextLine();
        PessoaFisica pf = new PessoaFisica(nomePF, cpfPF, enderecoPF, emailPF);

        // Dados da pessoa juridica
        System.out.println("\nDigite os dados da Pessoa Jurídica:");
        System.out.print("Nome: ");
        String nomePJ = scanner.nextLine();
        System.out.print("CNPJ: ");
        String cnpjPJ = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoPJ = scanner.nextLine();
        System.out.print("Email: ");
        String emailPJ = scanner.nextLine();
        PessoaJuridica pj = new PessoaJuridica(nomePJ, cnpjPJ, enderecoPJ, emailPJ);

        // Dados do funcionario
        System.out.println("\nDigite os dados do Funcionário:");
        System.out.print("Nome: ");
        String nomeFunc = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfFunc = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoFunc = scanner.nextLine();
        System.out.print("Salário: ");
        double salarioFunc = scanner.nextDouble();
        Funcionario func = new Funcionario(nomeFunc, cpfFunc, enderecoFunc, salarioFunc);

        // Imprime os objetos
        System.out.println("\nDados cadastrados:");
        System.out.println(pf);
        System.out.println(pj);
        System.out.println(func);

        scanner.close();
    }
}

// Classe pessoa fisica
class PessoaFisica {
    private String nome;
    private String cpf;
    private String endereco;
    private String email;

    // Inicia os atributos
    public PessoaFisica(String nome, String cpf, String endereco, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
    }

    // Retorna em string os objetos
    public String toString() {
        return "PessoaFisica{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

// Classe pessoa juridica
class PessoaJuridica {
    private String nome;
    private String cnpj;
    private String endereco;
    private String email;

    // Inicia os atributos
    public PessoaJuridica(String nome, String cnpj, String endereco, String email) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.email = email;
    }

    // Retorna em string os objetos
    public String toString() {
        return "PessoaJuridica{" +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

// Classe funcionario
class Funcionario {
    private String nome;
    private String cpf;
    private String endereco;
    private double salario;

    // Inicia os atributos
    public Funcionario(String nome, String cpf, String endereco, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salario = salario;
    }

    // Retorna em string os objetos
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", salario=" + salario +
                '}';
    }
}
