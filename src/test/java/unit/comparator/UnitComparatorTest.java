package unit.comparator;

import org.junit.Before;
import org.junit.Test;
import unit.comparator.exception.UnIdenticalUnitTypeException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by sanjeev on 11/07/17.
 */
public class UnitComparatorTest
{

    private AddableMeasurement oneFeet;
    private AddableMeasurement twelveInch;
    private AddableMeasurement twoInch;
    private AddableMeasurement threeFeet;
    private AddableMeasurement oneYard;
    private AddableMeasurement fiveCentimeter;
    private AddableMeasurement fourInch;
    private AddableMeasurement threeInch;
    private AddableMeasurement twoPointFiveCentimeter;
    private AddableMeasurement twoNineInch;
    private AddableMeasurement oneGallon;
    private AddableMeasurement oneLitre;
    private AddableMeasurement threeSevenLitres;
    private AddableMeasurement fourSevenLitres;
    private Measurement twoTwelveFahrenheit;
    private Measurement hundredCelsius;

    @Before
    public void setUp(){
        oneFeet    = new AddableMeasurement(1, Unit.FEET);
        twelveInch = new AddableMeasurement(12, Unit.INCH);
        twoInch    = new AddableMeasurement(2, Unit.INCH);
        threeFeet  = new AddableMeasurement(3,Unit.FEET);
        oneYard    = new AddableMeasurement(1,Unit.YARD);
        fiveCentimeter = new AddableMeasurement(5.08f, Unit.CENTIMETER);
        fourInch = new AddableMeasurement(4, Unit.INCH);
        threeInch = new AddableMeasurement(3, Unit.INCH);
        twoNineInch = new AddableMeasurement(2.984252f,Unit.INCH);
        twoPointFiveCentimeter = new AddableMeasurement(2.5f, Unit.CENTIMETER);
        oneGallon = new AddableMeasurement(1, Unit.GALLON);
        oneLitre = new AddableMeasurement(1, Unit.LITRE);
        threeSevenLitres = new AddableMeasurement(3.78541f, Unit.LITRE);
        fourSevenLitres = new AddableMeasurement(4.78541f, Unit.LITRE);
        twoTwelveFahrenheit = new Measurement(212, Unit.FAHRENHEIT);
        hundredCelsius = new Measurement(100, Unit.CELSIUS);

    }

    @Test
    public void shouldReturnTrueWhenComparingOneFeetWithTwelveInch() {
        assertTrue(oneFeet.equalsTo(twelveInch));
    }

    @Test
    public void shouldReturnFalseWhenComparingOneFeetWithTwoInches() {
        assertFalse(oneFeet.equalsTo(twoInch));
    }

    @Test
    public void shouldReturnTrueWhenComparingOneYardWithThreeFeet(){
        assertTrue(oneYard.equalsTo(threeFeet));
    }

    @Test
    public void shouldReturnFalseWhenComparingOneYardWithOneFeet(){
        assertFalse(oneYard.equalsTo(oneFeet));
    }

    @Test
    public void shouldReturnTrueWhenComparingTwoInchWithFivePointZeroEightCentimeter(){
        assertTrue(twoInch.equalsTo(fiveCentimeter));
    }

    @Test
    public void shouldReturnFalseWhenComparingOneFeetWithFivePointZeroEightCentimeter(){
        assertFalse(oneFeet.equalsTo(fiveCentimeter));
    }

    @Test
    public void shouldAddTwoInchAndTwoInchAndEqualsFourInch() throws UnIdenticalUnitTypeException {
        assertEquals(fourInch, twoInch.add(twoInch));
    }

    @Test
    public void shouldAddTwoInchAndTwoPointFiveCentimeterAndEqualsThreeInch() throws UnIdenticalUnitTypeException {
        assertEquals(twoNineInch, twoInch.add(twoPointFiveCentimeter));
    }

    @Test
    public void shouldReturnTrueWhenComparingOneGallonWithThreeSevenLitres(){
        assertTrue(oneGallon.equalsTo(threeSevenLitres));
    }

    @Test
    public void shouldReturnFourSevenLitresWhenAddingOneLitreAndOneGallon() throws UnIdenticalUnitTypeException {
        assertEquals(fourSevenLitres,oneLitre.add(oneGallon));
    }

    @Test(expected = UnIdenticalUnitTypeException.class)
    public void shouldThrowUnIdenticalUnitTypeExceptionWhenAddindTwoDifferentUnits() throws UnIdenticalUnitTypeException {
        assertEquals(fourSevenLitres,oneLitre.add(oneFeet));
    }

    @Test
    public void shouldReturnTrueWhenComparingHundredCelsiusWithTwoTwelveFahrenheit() throws UnIdenticalUnitTypeException {
        assertTrue(hundredCelsius.equalsTo(twoTwelveFahrenheit));
    }

}
