package laborator3pb2;

public abstract class Animal implements Abilitate {
	
	protected int varsta;
	protected String nume;
	protected Mediu mediu;
	
	public Animal() {
		
	}

	public Animal(int varsta, String nume, Mediu mediu) {
		super();
		this.varsta = varsta;
		this.nume = nume;
		this.mediu = mediu;
	}
	
	
	

}
