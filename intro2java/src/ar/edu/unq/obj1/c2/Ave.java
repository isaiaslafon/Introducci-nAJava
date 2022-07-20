package ar.edu.unq.obj1.c2;

public abstract class Ave {

	protected int energia = 100;
	
	/*
	private int energia = 100;
	protected getEnergia(){ return energia }
	 */

	public int energia() {
		return energia;
	}

	protected abstract int energiaNecesaria(int distancia);

	protected void validarVolar(int distancia) {
		if (this.energiaNecesaria(distancia) > energia) {
			throw new RuntimeException("No tiene la energia suficiente para volar: " + distancia);
		}
	}
	
	public void volar(int distancia) {
		this.validarVolar(distancia);
		energia = energia - this.energiaNecesaria(distancia);
	}
	
	public void comer(Alimento alimento) {
		energia = energia + alimento.energiaQueAporta();
	}
}