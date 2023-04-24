import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

@Test

    void twoPlusTwoShouldEqualFour(){
    SimpleCalculator calculator = new SimpleCalculator();
    assertEquals(4,calculator.add(2,2));
}
}



//https://www.youtube.com/watch?v=o5pE7L2tVV8
//https://www.youtube.com/watch?v=vZm0lHciFsQ