package ar.edu.unq.obj1.c2;

public class Golondrina {

	private int energia = 100;

	public int energia() {
		return energia;
	}

	private int energiaNecesaria(int distancia) {
		return 10 + distancia;
	}

	private void validarVolar(int distancia) {
		if (this.energiaNecesaria(distancia) > energia) {
			throw new RuntimeException("No tiene la energia suficiente para volar: " + distancia);
		}
	}
	
	public void volar(int distancia) {
		this.validarVolar(distancia);
		energia = energia - this.energiaNecesaria(distancia);
	}
	
	/*
	public void comer(Alpiste alimento) {
		energia = energia + alimento.energiaQueAporta();
	}
	
	public void comer(Manzana alimento) {
		energia = energia + alimento.energiaQueAporta();
	}

	*/
	
	public void comer(Alimento alimento) {
		energia = energia + alimento.energiaQueAporta();
	}
}

/*
public class Golondrina extends Ave{

	@Override
	protected int energiaNecesaria(int distancia) {
		return 10 + distancia;
	}
}
*/