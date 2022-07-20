package ar.edu.unq.obj1.c2.alimentos;

public class ManzanaVerde extends Manzana{
	
	public ManzanaVerde() {
		super();//super(3);
	}

	
	public ManzanaVerde(int madurez) {
		super(madurez);
	}
	
	@Override
	public int energiaQueAporta() {
		return super.energiaQueAporta() / 2;
	}
}
