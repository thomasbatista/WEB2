package lista_exercicios_02.br.edu.ifsp.pessoas;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String cpf, Endereco endereco) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    public String getCpf() { return cpf; }

    @Override
    public String getDados() {
        return "=== Pessoa Física ==="
                + "\nNome:     " + getNome()
                + "\nCPF:      " + cpf
                + "\nEndereço: " + getEndereco();
    }
}
