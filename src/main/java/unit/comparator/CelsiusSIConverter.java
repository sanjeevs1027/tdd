package unit.comparator;

/**
 * Created by sanjeev on 12/07/17.
 */
public class CelsiusSIConverter implements  SIConvertor{

    public float getSIValue(float unitValue) {
        return unitValue + 273.15f;
    }

    public float getUnitValue(float siValue) {
        return siValue - 273.15f;
    }
}
