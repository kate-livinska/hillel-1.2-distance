package manager;

public class KmToMlsConverter implements Converter {
    @Override
    public double convert(double value) {
        return value / COEFFICIENT;
    }
}
