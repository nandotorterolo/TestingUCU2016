package ecommerce;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NameUtils {


    public static String capitalizarTexto(String textoSinFormato){
        String []palabras = textoSinFormato.split(" ");
        StringBuilder textoFormateado = new StringBuilder();

        for(String palabra : palabras){
            textoFormateado.append(palabra.substring(0,1).toUpperCase()
                    .concat( palabra.substring(1,palabra.length())
                            .toLowerCase()).concat(" "));
        }

        return textoFormateado.toString().trim();
    }

    public static BigDecimal parse(final String amount, final Locale locale) throws ParseException {
        final NumberFormat format = NumberFormat.getNumberInstance(locale);
        if (format instanceof DecimalFormat) {
            ((DecimalFormat) format).setParseBigDecimal(true);
        }
        return (BigDecimal) format.parse(amount.replaceAll("[^\\d.,]",""));
    }
}
