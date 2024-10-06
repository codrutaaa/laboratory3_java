package laborator3pb2;


public abstract class Mamifer extends Animal {
	
	protected int nrCopii;
	
	public Mamifer(int varsta, String nume, Mediu mediu, int nrCopii) {
		super(varsta, nume, mediu);
		this.nrCopii = nrCopii;
	}

	

}
