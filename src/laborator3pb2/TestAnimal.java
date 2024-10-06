package laborator3pb2;
public class TestAnimal {
	
	static void a(Animal[] tablou) {//creati un tablou de animale si af
		
		tablou[0] = new Caine(5,"Beethoven",Mediu.PAMANT,3);
		tablou[1] = new Pisica(3,"Kitty Galore",Mediu.PAMANT,5);
		tablou[2] = new Caine(5,"Bolt",Mediu.PAMANT,2);
		tablou[3] = new Colibri(1,"Poli",Mediu.AER,100);
		
		for(Animal a : tablou)
			System.out.println(a);
		
	}
	
	static void b(Animal[] tablou) {
		int contor = 0;
		for(Animal a : tablou)
			if(a.poateZbura())
				contor++;
		System.out.println(contor + " animal(e) poate/pot zbura");
	}
	
	static void c(Animal[] tablou) {
		for(Animal a : tablou)
			if(a.sePoateCatara()== true && a.poateInnota() == false)
				System.out.println(a);
	}

	public static void main(String[] args) {//afiseaza in main toate tablourile de la subpct
		Animal[] tablou = new Animal[4];
		
		a(tablou);
		b(tablou);
		c(tablou);

	}

}
