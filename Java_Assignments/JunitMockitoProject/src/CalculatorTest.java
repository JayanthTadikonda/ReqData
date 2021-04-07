import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CalculatorTest {

    Calculator c;
    CalculatorService calculatorService = mock(CalculatorService.class);

    @Mock
    List<Integer> list;



    @Test
    @DisplayName("Testing Inject Mocks")
    void testingGivenWhenThen(){
        list = mock(List.class);
        //Given
        //CalculatorService service = null;
        calculatorService.add(2,3);
    }

    @Test
    @DisplayName("Testing Mock List")
    void usingMockForList(){
        list = mock(List.class);
        when(list.size()).thenReturn(2);
        assertEquals(2,list.size());
    }

    @Test
    @DisplayName("Testing Mockito with Strings List")
    void usingMockStringList(){
        List<String> strings = mock(List.class);
        strings.add("Jack");
        when(strings.contains("Jack")).thenReturn(true);
        assertEquals(true,strings.contains("Jack"));
    }

    @BeforeEach
    void printTest(){
        System.out.println("Testing Started!");
    }

    @BeforeEach
    void setup(){
        c = new Calculator(calculatorService);
    }

    @Test
    @DisplayName("Adding two integers")
    void perform() {

        when(calculatorService.add(2,3)).thenReturn(5);
        assertEquals(5,c.perform(2,3));

    }

    @Test
    @DisplayName("Adding two integers")
    void performAgain() {

        //calculator.perform(2,3);
        assertEquals(9,calculatorService.add(5,4));
    }
}