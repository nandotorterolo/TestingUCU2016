package testing;

import static org.junit.Assert.assertEquals;

import ecommerce.NameUtils;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.text.ParseException;
import java.util.Locale;

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

    @Test
    public void testParseNumber() throws ParseException {
        final String dollarsA = "$199.00";
        final String real = "R$ 399,00";
        final String dollarsB = "£25.00";
        final String tailingEuro = "90,83 €";
        final String dollarsC = "$199.00";
        final String dirham = "AED 449.00";

        System.out.println(NameUtils.parse(dollarsA, Locale.US));
        System.out.println(NameUtils.parse(real, Locale.FRANCE));
        System.out.println(NameUtils.parse(dollarsB, Locale.US));
        System.out.println(NameUtils.parse(tailingEuro, Locale.FRANCE));
        System.out.println(NameUtils.parse(dollarsC, Locale.US));
        System.out.println(NameUtils.parse(dirham, Locale.US));
    }

}
 