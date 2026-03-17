package lista_exercicios.exercicio01.test;

import lista_exercicios.exercicio01.domain.Produto;

public class ProdutoTest {
    static void main() {
        Produto produto = new Produto(123, "Teclado");

        System.out.println("-- Dados iniciais --");
        System.out.println(produto);

        produto.setNome("Mouse");
        produto.setPreco(100);

        System.out.println("-- Dados atualizados --");
        System.out.println(produto);
    }
}
