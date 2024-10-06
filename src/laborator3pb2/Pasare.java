package laborator3pb2;

public abstract class Pasare extends Animal {
	
	protected int viteza;

	public Pasare(int varsta, String nume, Mediu mediu, int viteza) {
		super(varsta, nume, mediu);
		this.viteza = viteza;
	}
	
	

}