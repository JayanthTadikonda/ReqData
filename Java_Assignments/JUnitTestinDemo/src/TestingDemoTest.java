import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TestingDemoTest {


    //TestingDemo t = mock(TestingDemo.class);
    TestingDemo t = null;
    CalculatorService c = mock(CalculatorService.class);

    void setup(){
        t = new TestingDemo(c);
    }

    @Test
    @DisplayName("Addition")
    void add() {
        when(t.add(2,3)).thenReturn(5);
        assertEquals(5, t.add(2,3));

    }

    void multi(int i, int j){
    }
//    @Nested
//    @DisplayName("Nested TestCase")
//    class NestedTest{
//        @Test
//        @DisplayName("Inside Nested - MULTIPLICATION")
//        public void multiply(){
//            t1.multiply(1,9);
//            assertEquals(9,t1.multiply(1,9));
//
//        }
//        @Test
//        @DisplayName("Inside Nested - DIVISION")
//        public void div(){
//            //t1.div(4,2);
//            //assertEquals(2,t1.div(4,2),"Division Correct");
//            assertAll(
//                    ()-> assertEquals(3,t1.div(6,2),"division")
//            );
//        }
//    }

}