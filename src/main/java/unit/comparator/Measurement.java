package unit.comparator;

/**
 * Created by sanjeev on 12/07/17.
 */
public class Measurement {
    private final float value;
    private final Unit unit;

    public Measurement(float value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public float getValue() {
        return value;
    }

    public Unit getUnit() {
        return unit;
    }

    public boolean equalsTo(Measurement measurement) {
        boolean isEqualMeasurement = false;

        if(this.getUnitType() == measurement.getUnitType()) {
            isEqualMeasurement = this.getSIValue() == measurement.getSIValue();
        }

        return isEqualMeasurement;
    }

    protected float getSIValue()
    {
        return this.getUnit().getSIValue(this.getValue());
    }
    protected float getUnitValueFromSI(float siValue){
        return this.getUnit().getUnitValue(siValue);
    }

    public UnitType getUnitType() {
        return  this.unit.getType();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Measurement that = (Measurement) o;

        if (Float.compare(that.value, value) != 0) return false;
        return unit == that.unit;
    }

    @Override
    public int hashCode() {
        int result = (value != +0.0f ? Float.floatToIntBits(value) : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        return result;
    }
}
