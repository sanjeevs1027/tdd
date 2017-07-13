package unit.comparator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by sanjeev on 11/07/17.
 */
public class CelsiusSIConverterTest
{

    CelsiusSIConverter celsiusSIConverter;


    @Before
    public void setUp(){
        celsiusSIConverter = new CelsiusSIConverter();
    }

    @Test
    public void shouldReturnKelvinFromCelsius() {
        assertEquals(274.15f,celsiusSIConverter.getSIValue(1),0.1f);
    }

    @Test
    public void shouldReturnCelsiusFromKelvin() {
        assertEquals(1f,celsiusSIConverter.getUnitValue(274.15f),0.1f);
    }

}
