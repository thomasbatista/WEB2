package lista_exercicios_02.br.edu.ifsp.pessoas;

public class Main {
    public static void main(String[] args) {

        Endereco endFisica = new Endereco("Rua das Flores", "123", "Centro", "Campos do Jordão");
        PessoaFisica pf = new PessoaFisica("João Pedro", "123.456.789-00", endFisica);

        Endereco endJuridica = new Endereco("Av. Paulista", "1000", "Bela Vista", "São Paulo");
        PessoaJuridica pj = new PessoaJuridica("Tech LTDA", "12.345.678/0001-99", endJuridica);

        System.out.println(pf.getDados());
        System.out.println();
        System.out.println(pj.getDados());
    }
}
