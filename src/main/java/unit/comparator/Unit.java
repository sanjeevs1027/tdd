package unit.comparator;

/**
 * Created by sanjeev on 11/07/17.
 */
public enum Unit
{
    FEET(UnitType.DISTANCE, new SimpleMeasurementSIConverter(0.3048f)), INCH(UnitType.DISTANCE, new SimpleMeasurementSIConverter(0.0254f)),
    YARD(UnitType.DISTANCE, new SimpleMeasurementSIConverter(0.9144f)), CENTIMETER(UnitType.DISTANCE, new SimpleMeasurementSIConverter(0.01f)),
    GALLON(UnitType.VOLUME, new SimpleMeasurementSIConverter(3.78541f)), LITRE(UnitType.VOLUME, new SimpleMeasurementSIConverter(1)),
    CELSIUS(UnitType.TEMPERATURE, new CelsiusSIConverter()),FAHRENHEIT(UnitType.TEMPERATURE, new FahrenheitSIConverter());

    private UnitType type;
    private SIConvertor convertor;


    Unit(UnitType type, SIConvertor convertor) {
        this.type = type;
        this.convertor = convertor;
    }

    public UnitType getType() {
        return type;
    }

    public float getSIValue(float unitValue){
       return this.convertor.getSIValue(unitValue);
    }

    public float getUnitValue(float siValue){
       return this.convertor.getUnitValue(siValue);
    }
}
