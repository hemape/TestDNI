package Logica;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcularLetraTest {

	@Test
	public void devolverLetra(){
		CalcularLetra c = new CalcularLetra("12345378");
		assertEquals('A',(c.devolverLetra()));
	}
}
