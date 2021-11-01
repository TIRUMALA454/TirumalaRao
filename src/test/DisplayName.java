package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DisplayName {
	DisplayName name;
	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
    @DisplayName1("Custom test name containing spaces")
    void testWithDisplayNameContainingSpaces() {
    }
	 @Test
	    @DisplayName1("╯°□°）╯")
	    void testWithDisplayNameContainingSpecialCharacters() {
	    }

	    @Test
	    @DisplayName1("😱")
	    void testWithDisplayNameContainingEmoji() {
	    }

	}



