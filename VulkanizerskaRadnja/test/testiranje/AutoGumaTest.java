package testiranje;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import auto_radnja.gume.AutoGuma;

class AutoGumaTest {

	AutoGuma ag;
	
	@BeforeEach
	void setUp() throws Exception {
		
		ag = new AutoGuma();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		
		ag = null;
		
	}



	@Test
	void testSetMarkaModelSveOk() {
		
		ag.setMarkaModel("Continental");
		
		assertEquals("Continental", ag.getMarkaModel());
		
	}
	
	@Test
	void testSetMarkaModelNull() {
		
		assertThrows(NullPointerException.class, () -> ag.setMarkaModel(null));
		
	}
	
	@Test
	void testSetMarkaModelDuzina() {
		
		assertThrows(IllegalArgumentException.class, () -> ag.setMarkaModel("xx"));
		
	}
	
	@ParameterizedTest
	@CsvSource({
		
		"15",
		"19",
		"21"
		
	})
	void testSetPrecnik(int precnik) {
		
		ag.setPrecnik(precnik);
		
		assertEquals(precnik, ag.getPrecnik());
		
	}
	
	

	
}
