package lista_exercicios_03.exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AreaCalculavel> figuras = new ArrayList<>();

        figuras.add(new Quadrado(5));
        figuras.add(new Retangulo(4, 7));
        figuras.add(new Circulo(3));

        for (AreaCalculavel figura : figuras) {
            System.out.printf("%-12s → Área: %.2f%n",
                    figura.getClass().getSimpleName(),
                    figura.calcularArea()
            );
        }
    }
}
