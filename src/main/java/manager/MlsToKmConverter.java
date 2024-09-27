package manager;

public class MlsToKmConverter implements Converter {
    @Override
    public double convert(double value) {
        return value * COEFFICIENT;
    }
}
