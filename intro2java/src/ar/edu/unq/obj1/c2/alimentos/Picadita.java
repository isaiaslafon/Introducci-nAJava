package ar.edu.unq.obj1.c2.alimentos;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import ar.edu.unq.obj1.c2.Alimento;

public class Picadita implements Alimento {

	Collection<Alimento> alimentos = new HashSet<Alimento>();
	//List<Alimento> alimentos = new HashSet<Alimento>();
	//HashSet<E>();
	//ArrayList<E>(); LinkedList<E>();
	
	public int energiaQueAporta() {
		/*
		//Implementación procedural.
		int acum = 0;
		for(Alimento alimento : alimentos) {
			acum += alimento.energiaQueAporta();
		}
		return acum;
		*/
		/*
		//Implementación map + reduce.
		return alimentos.stream().mapToInt( (alimento) -> alimento.energiaQueAporta() ).reduce(0, (a,b) -> a + b);
		*/
		//Implementación con collector.
		return alimentos.stream().collect(Collectors.summingInt((alimento) -> alimento.energiaQueAporta()));
	}

	public void agregarAlimento(Alimento alimento) {
		alimentos.add(alimento);
	}
	
	public Collection<Alimento> alimentosQueAportanMasDe(int energia) {
		/*
		//No funciona porque lo que devuelve el filter es un stream.
		return alimentos.stream().filter( (alimento) -> alimento.energiaQueAporta() > energia);
		*/
		return alimentos.stream().filter( (alimento) -> alimento.energiaQueAporta() > energia).collect(Collectors.toSet());
	}
	
	public boolean algunoAportaMasDe(int energia) {
		return alimentos.stream().anyMatch( (alimento) -> alimento.energiaQueAporta() > energia);
	}
	
	public boolean todosAportanMasDe(int energia) {
		return alimentos.stream().allMatch( (alimento) -> alimento.energiaQueAporta() > energia);
	}
	
}
