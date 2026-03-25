package lista_exercicios_01.exercicio02.test;

import lista_exercicios_01.exercicio02.domain.Data;

import javax.swing.JOptionPane;

public class DataTest {
    static void main() {
        Data data = new Data(15, 6, 2003);
        System.out.println("Data inicial: " + data.formatar());

        try {
            int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia (1-30):"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês (1-12):"));
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano (>= 1900):"));

            data.setDia(dia);
            data.setMes(mes);
            data.setAno(ano);

            System.out.println("Nova data: " + data.formatar());
            JOptionPane.showMessageDialog(null, "Nova data: " + data.formatar());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: insira apenas números inteiros.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}