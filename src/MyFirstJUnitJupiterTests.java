import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MyFirstJUnitJupiterTests {

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("number1");
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}


	   private final Calculator calculator = new Calculator();

	    @Test
	    void addition() {
	        assertEquals(2, calculator.add(1, 1));
	        
	    }

	}
