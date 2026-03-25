package lista_exercicios_02.br.edu.ifsp.pessoas;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj, Endereco endereco) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() { return cnpj; }

    @Override
    public String getDados() {
        return "=== Pessoa Jurídica ==="
                + "\nNome:     " + getNome()
                + "\nCNPJ:     " + cnpj
                + "\nEndereço: " + getEndereco();
    }
}
