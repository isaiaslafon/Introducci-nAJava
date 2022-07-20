package ar.edu.unq.obj1.c2.alimentos;

import ar.edu.unq.obj1.c2.Alimento;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PicaditaTest {
	
	Picadita picadita = new Picadita();
		
	@Test
	void testPicaditaVacia() {
		assertEquals(0,picadita.energiaQueAporta());
	}
	
	@Test
	void testPicaditaCompleta() {
		picadita.agregarAlimento(new Alpiste());
		picadita.agregarAlimento(new Manzana());
		assertEquals(25,picadita.energiaQueAporta());
	}
	
	@Test
	void testAportaMasDe() {
		Alimento alpiste = new Alpiste();
		picadita.agregarAlimento(alpiste);
		picadita.agregarAlimento(new Manzana());
		assertEquals(1, picadita.alimentosQueAportanMasDe(10).size());
		assertTrue(picadita.alimentosQueAportanMasDe(10).contains(alpiste));
		assertTrue(picadita.algunoAportaMasDe(10));
		assertFalse(picadita.todosAportanMasDe(10));
	}
}
