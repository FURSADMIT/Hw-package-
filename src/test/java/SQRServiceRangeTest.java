import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.javaqa.javamvn.hwsqr.SQRServiceRange;

public class SQRServiceRangeTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/numberSqrt.csv")
    public void numberSqrtTest(int expected, int low, int high){
        SQRServiceRange service = new SQRServiceRange();
        int actual = service.numberSqrt(low, high);

        Assertions.assertEquals(expected, actual);
    }
}
