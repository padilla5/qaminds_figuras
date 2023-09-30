package org.qaminds;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.figuras.Circulo;
import org.example.figuras.Rectangulo;
import org.example.figuras.Triangulo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FiguraTest {

    WebDriver driver;
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

    @Test
    public void validaWeb(){
        WebElement element = driver.findElement(By.id("query"));
        element.sendKeys("Selenium");

        //WebElement button = driver.findElement(By.cssSelector("#search > form > input.button"));
        //button.click();

        WebElement result = driver.findElement(By.cssSelector("div:nth-child(1) > div.im-header > h2 > a:nth-child(1)"));

        System.out.print(result.getText());
        Assert.assertTrue(result.getText().contains("Kotlin"));

        driver.quit();
    }

    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("Https://google.com/");
        driver.navigate().to("Https://mvnrepository.com/");
    }
    @BeforeTest
    public void beforeTest(){
        openBrowser();
    }

    @AfterTest
    public void afterTest(){
        //driver.quit();
    }
}
