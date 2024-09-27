package manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KmToMlsConverterTest {
    private Converter kmConverter;

    @Test
    void convertKmTest() {
        kmConverter = new KmToMlsConverter();

        double testInput = 10;
        double expectedOutput = testInput / 1.60934;

        double actualOutput = kmConverter.convert(testInput);

        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}