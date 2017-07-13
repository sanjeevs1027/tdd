package unit.comparator;


import unit.comparator.exception.UnIdenticalUnitTypeException;

/**
 * Created by sanjeev on 11/07/17.
 */
public class AddableMeasurement extends Measurement implements Addable<AddableMeasurement>
{

    public AddableMeasurement(float value, Unit unit) {
        super(value, unit);
    }

    public AddableMeasurement add(AddableMeasurement measurement) throws UnIdenticalUnitTypeException {
        if(this.getUnitType() == measurement.getUnitType()) {
           float temp  =  getUnitValueFromSI(this.getSIValue() + measurement.getSIValue());
           return new AddableMeasurement(temp, this.getUnit());
        }
        else {
            throw new UnIdenticalUnitTypeException("Cannot add two measurements of different unit type");
        }
    }
}
