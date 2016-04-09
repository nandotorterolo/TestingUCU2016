package testing;

import static org.junit.Assert.assertEquals;

import ecommerce.NameUtils;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class NameUtilsTest {

    @Test
    @FileParameters("src/test/resources/NameUtils.test.csv")
    public void testNameCapitalization(String input, String expected) {

        System.out.println(input);
        assertEquals(expected, NameUtils.capitalizarTexto(input));

    }

    @Test
    @FileParameters("src/test/resources/values.csv")
    public void testAdd(String a, String b, String expected) {
        System.out.println(a);

        int ia = Integer.parseInt(a);
        int ib = Integer.parseInt(b);
        int ic = Integer.parseInt(expected);
        assertEquals("Error al sumar", ic, ia + ib);
    }

}
 