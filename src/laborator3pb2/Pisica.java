package laborator3pb2;


public class Pisica extends Mamifer {

	public Pisica(int varsta, String nume, Mediu mediu, int nrCopii) {
		super(varsta, nume, mediu, nrCopii);
	}

	@Override
	public String toString() {
		return "Pisica [varsta=" + varsta + ", nume=" + nume + ", mediu=" + mediu + ", nrCopii=" + nrCopii + "]";
	}

	
	@Override
	public boolean poateZbura() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean poateInnota() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sePoateCatara() {
		// TODO Auto-generated method stub
		return true;
	}
	
	

}

