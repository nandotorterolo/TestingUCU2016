package testing;

import ecommerce.NameUtils;
import ecommerce.Product;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/**
 * Combinamos lo que ya habíamos aprendido de data-driven testing, o sea, parametrizamos el caso de prueba anterior,
 * para que tome los nombres de los productos desde un archivo. Completar ese archivo a mano con al menos 5 productos.
 */
@RunWith(JUnitParamsRunner.class)
public class Desafio2Test {

    FirefoxDriver wd;
    DecimalFormat df = new DecimalFormat("#,###,##0.00");

    @Before
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    @FileParameters("src/test/resources/Products.csv")
    public void testProduct(String title, String price) throws ParseException{

        System.out.println(String.format("%s - %s", title, price));

        // Todo parse symbols $
        Product product = new Product(title, Double.parseDouble(price));

        wd.get("http://demo.opencart.com");
        wd.findElement(By.name("search")).click();
        wd.findElement(By.name("search")).clear();
        wd.findElement(By.name("search")).sendKeys(title);
        wd.findElement(By.xpath("//span[@class='input-group-btn']/button")).click();
        wd.findElement(By.id("grid-view")).click();
        wd.findElement(By.xpath("//div[@class='image']/a/img")).click();
        String nombre = wd.findElement(By.cssSelector("h1")).getText();

        Assert.assertEquals("Name first element differen", title,nombre);
    }

    @After
    public void tearDown() throws Exception {
        wd.close();
        wd.quit();
    }
}