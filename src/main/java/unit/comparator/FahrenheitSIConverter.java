package unit.comparator;

/**
 * Created by sanjeev on 12/07/17.
 */
public class FahrenheitSIConverter implements  SIConvertor{

    public float getSIValue(float unitValue) {
        return (float) ((unitValue + 459.67) * 5/9);
    }

    public float getUnitValue(float siValue) {
        return (9f/5f) * siValue - 459.67f;
    }
}
