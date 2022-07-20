package ar.edu.unq.obj1.c2;

import ar.edu.unq.obj1.c2.alimentos.*;

public class Main {

	public static void main(String[] args) {
		Golondrina pepita = new Golondrina();
		Manzana manzana = new Manzana();
		
		System.out.println("La energia de Pepita es: " + pepita.energia());
		pepita.volar(10);
		System.out.println("La energia de Pepita es: " + pepita.energia());
		/*
		//Error en compilación porque Object no es un alimento, aunque un Alpiste si e sun object.
		Object alpiste = new ALpiste();
		pepita.comer(alpiste);
		 */
		pepita.comer(new Alpiste());
		System.out.println("La manzana aporta: "  + manzana.energiaQueAporta());
		manzana.madurar();
		System.out.println("La manzana aporta luego de madurar: "  + manzana.energiaQueAporta());
		pepita.comer(new Manzana());
		System.out.println("La energia de Pepita es: "  +pepita.energia());

	}

}