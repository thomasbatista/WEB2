package lista_exercicios.exercicio02.domain;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public void setDia(int dia) {
        if (dia < 1 || dia > 30) {
            throw new IllegalArgumentException("Dia inválido, deve estar entre 1 - 30");
        }
        this.dia = dia;
    }

    public void setMes(int mes) {
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mês inválido, deve estar entre 1 -12");
        }
        this.mes = mes;
    }

    public void setAno(int ano) {
        if (ano < 1900) {
            throw new IllegalArgumentException("Ano inválido, deve ser >= 1900");
        }
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String formatar() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
