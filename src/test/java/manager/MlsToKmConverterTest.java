package manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MlsToKmConverterTest {
    private Converter mlsConverter;

    @org.junit.jupiter.api.Test
    void convertMlsTest() {
        mlsConverter = new MlsToKmConverter();

        double testInput = 5;
        double expectedOutput = testInput * 1.60934;

        double actualOutput = mlsConverter.convert(testInput);

        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}