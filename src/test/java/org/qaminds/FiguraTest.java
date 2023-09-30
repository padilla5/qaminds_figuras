package org.qaminds;

import org.example.figuras.Circulo;
import org.example.figuras.Rectangulo;
import org.example.figuras.Triangulo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FiguraTest {
    @Test
    public void validarCalcularAreaCirculo(){
        double radio = 5;
        Circulo circulo = new Circulo(radio);

        double resultadoEsperado = Math.PI * radio * radio;

        Assert.assertEquals(circulo.calcularArea(),resultadoEsperado);
    }

    @Test
    public void validarCalcularAreaTriangulo(){
        double base = 3;
        double altura = 4;

        Triangulo triangulo = new Triangulo(base,altura);

        double resultadoEsperado = base * altura / 2;

        Assert.assertEquals(triangulo.calcularArea(), resultadoEsperado);
    }

    @Test
    public void validarCalcularAreaRectangulo(){
        double base = 4;
        double altura = 5;

        Rectangulo rectangulo = new Rectangulo(base,altura);

        double resultadoEsperado = base * altura;

        Assert.assertEquals(rectangulo.calcularArea(),resultadoEsperado);
    }
}
