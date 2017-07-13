package unit.comparator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Created by sanjeev on 11/07/17.
 */
public class FahrenheitSIConverterTest
{

    FahrenheitSIConverter fahrenheitSIConverter;

    @Before
    public void setUp(){
fahrenheitSIConverter = new FahrenheitSIConverter();
    }

    @Test
    public void shouldReturnKelvinFromFahrenheit() {
        assertEquals(255.928f,fahrenheitSIConverter.getSIValue(1.0004f),0.2f);
    }

    @Test
    public void shouldReturnFahrenheitFromKelvin() {
        assertEquals(1f,fahrenheitSIConverter.getUnitValue(255.928f),0.1f);
    }

}
