import java.util.ArrayList;

public class PiesTester {

	public static void main(String[] args) {
		
		Pies[] psiaki = new Pies[8];
		ArrayList<Pies> psiakiLista = new ArrayList<Pies>();
		
		Pies pies1 = new Pies();
		pies1.setHeight(3);
		pies1.setName("Andrzej");
		Pies pies2 = new Pies(17, "Piotrek", 15);
		Pies pies3 = new Pies();
		
		
		System.out.println(pies1.toString());
		System.out.println(pies2.toString());
		
		pies1.bark();
		pies2.bark();
		pies3.bark();

		psiaki[0] = pies1;
		System.out.println(psiaki[0].toString());		
		psiaki[0].setHeight(15);		
		psiaki[0].setName("Janek");		
		System.out.println(psiaki[0].toString());		
		psiaki[1] = new Pies(5, "Kamil", 17);	
		
		
		
		psiakiLista.add(pies1);
		
	}

}
