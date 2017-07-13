package unit.comparator;

/**
 * Created by sanjeev on 12/07/17.
 */
public class SimpleMeasurementSIConverter implements  SIConvertor{

    private float factor;

    public SimpleMeasurementSIConverter(float factor) {
        this.factor = factor;
    }

    public float getSIValue(float unitValue) {
        return unitValue * factor;
    }

    public float getUnitValue(float siValue) {
        return siValue / factor;
    }
}
