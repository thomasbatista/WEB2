package lista_exercicios_03.exercicio01;

public class Circulo implements AreaCalculavel {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double getRaio() { return raio; }
    public void setRaio(double raio) { this.raio = raio; }
}
