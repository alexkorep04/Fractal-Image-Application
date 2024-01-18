package project4;

import edu.project4.entities.Point;
import edu.project4.functions.HeartTransformation;
import edu.project4.functions.Transformation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HeartTransformationTest {
    @Test
    @DisplayName("Test heart transformation")
    public void testHeart() {
        Transformation heartTransformation = new HeartTransformation();

        Point expected = new Point(1.0566281315466854, -0.36542713586180275);

        Point response = heartTransformation.apply(new Point(0.5, 1));

        assertThat(expected).isEqualTo(response);
    }
}
