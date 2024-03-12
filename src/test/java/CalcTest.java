import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcTest {
    static Calc calc;
    @BeforeAll
    public static void inst(){
        calc = new Calc();
    }

    @Test
    public void divide (){
        assertEquals(-2,calc.divide(-10,5));
    }

    @Test
    public void divideNull (){
        assertThrows(ArithmeticException.class, () -> calc.divide(5,0));
    }




}
