package project4;

import edu.project4.entities.Point;
import edu.project4.functions.PolarTransformation;
import edu.project4.functions.Transformation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PolarTransformationTest {
    @Test
    @DisplayName("Test polar transformation")
    public void testPolar() {
        Transformation polarTransformation = new PolarTransformation();

        Point expected = new Point(0.35241638234956674, 0.1180339887498949);

        Point response = polarTransformation.apply(new Point(0.5, 1));

        assertThat(expected).isEqualTo(response);
    }
}
