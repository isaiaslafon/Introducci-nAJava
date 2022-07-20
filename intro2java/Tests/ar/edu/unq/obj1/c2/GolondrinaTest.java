package ar.edu.unq.obj1.c2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.obj1.c2.alimentos.*;

class GolondrinaTest {

	/*
	@Test
	void test() {
		fail("Not yet implemented");
	}
		
	@Test
	void testVolar() {
		Golondrina pepita = new Golondrina();
		pepita.volar(10);
		assertEquals(80, pepita.energia());
	}
	*/
	Golondrina pepita;
	
	@BeforeEach
	void setUp() {
		pepita = new Golondrina();
	}
	
	@Test
	void testVolar() {
		pepita.volar(10);
		assertEquals(80, pepita.energia());
	}
	
	@Test
	void testComerAlpiste() {
		pepita.comer(new Alpiste());
		assertEquals(120, pepita.energia());
	}
	
	@Test
	void testComerPicadita() {
		Picadita picadita = new Picadita();
		picadita.agregarAlimento(new Manzana());
		picadita.agregarAlimento(new Alpiste());
		
		pepita.comer(picadita);
		assertEquals(125, pepita.energia());
	}
	
	@Test
	void testNoPuedeVolarTanto() {
		assertThrows(RuntimeException.class, () -> pepita.volar(1000));
		assertThrows(Exception.class, () -> pepita.volar(1000));
	}
	
}
/*
 *

test "la manzana aporta 10 al madurar" {
	
	assert.equals(5, manzana.energiaQueAporta())
	manzana.madurar()
	assert.equals(10, manzana.energiaQueAporta())
}


test "Pepita queda con 125 de energia al comer una picadita de alpiste y manzana" {
	
	const picadita = new Picadita()
	picadita.agregarAlCombo(alpiste)
	picadita.agregarAlCombo(manzana)
	pepita.comer(picadita)
	assert.equals(125, pepita.energia())
}
*/
