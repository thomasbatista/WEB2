package lista_exercicios_02.br.edu.ifsp.pessoas;

public abstract class Pessoa {
    private String   nome;
    private Endereco endereco;

    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public abstract String getDados();
}
