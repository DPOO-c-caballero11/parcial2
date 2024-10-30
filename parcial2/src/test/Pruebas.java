package test;
import logica.Parcial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class Pruebas {
	
	private Parcial parcial;
	
	
	@BeforeEach
	public void setUp() {
		
		this.parcial = new Parcial();
	}
	
	
	@Test
	public void encontrarRaicesTest() throws Exception {
		
		assertThrows(IllegalArgumentException.class, () -> this.parcial.encontrarRaices(0,5,6)); // cuando a=0
		assertThrows(Exception.class, () -> this.parcial.encontrarRaices(1,2,3)); // discriminante negativo
		assertEquals("-2.0,-3.0", this.parcial.encontrarRaices(1, 5, 6)); // discriminante positivo
		assertEquals("2.0", this.parcial.encontrarRaices(1, -4, 4)); // raiz doble
		assertEquals("0.0, -1.5", this.parcial.encontrarRaices(4, 6, 0)); // cuando c = 0
		assertEquals("2.0,-2.0", this.parcial.encontrarRaices(4, -16, 0)); // cuando b = 0
	}
	
}
