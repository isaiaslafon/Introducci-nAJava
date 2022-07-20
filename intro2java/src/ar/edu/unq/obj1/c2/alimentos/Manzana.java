package ar.edu.unq.obj1.c2.alimentos;

import ar.edu.unq.obj1.c2.Alimento;

public class Manzana implements Alimento{
	private int madurez =1;
	private static final int base = 5; 
	//final hace que sea constante. 
	//static hace que no cree una variable para cada isntancia.

	
	public Manzana() {
	 //Este sirve para no obligar a setear en cada instanciación los valores.
	}
	 
	public Manzana(int madurez) {
		this.setMadurez(madurez);
		//this.madurez = madurez;
	}
		
	//@Override
	public int energiaQueAporta() {
		return base * madurez;
	}

	public void madurar() {
		madurez += 1;
	}

	/*
 	public void madurar() {
		this.setMadurez(this.getMadurez() + 1)
	}

	public void madurar() { //es feo pero es válido sintácticamente.
		setMadurez(getMadurez() + 1)
	}
	 */

	public int getMadurez() {
		return madurez;
		//return this.madurez;
	}

	public void setMadurez(int madurez) {
		this.madurez = madurez;
	}
}

