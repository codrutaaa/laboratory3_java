package laborator3pb2;


public class Colibri extends Pasare {

	public Colibri(int varsta, String nume, Mediu mediu, int viteza) {
		super(varsta, nume, mediu, viteza);
	}

	@Override
	public String toString() {
		return "Colibri [varsta=" + varsta + ", nume=" + nume + ", mediu=" + mediu + ", viteza=" + viteza + "]";
	}

	@Override
	public boolean poateZbura() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean poateInnota() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sePoateCatara() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
