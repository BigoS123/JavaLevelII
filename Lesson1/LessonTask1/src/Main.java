
public class Main {

	public static void main(String[] args) {

//		Punkt punkt = new Punkt(4, 5);
//		Punkt punkt2 = new Punkt(4, 5);
//
//		if (punkt == punkt2) {
//			System.out.println("TAKIE SAME");
//		} else {
//			System.out.println("INNE");
//		}
//
//		System.out.println("Czy takie same " + punkt.equals(punkt2));

		System.out.println();

		Punkt punkt3 = new Punkt(4, 5);
		Punkt punkt4 = punkt3;

		if (punkt3 == punkt4) {
			System.out.println("TAKIE SAME");
		} else {
			System.out.println("INNE");
		}

		System.out.println("Czy takie same " + punkt3.equals(punkt4));

		System.out.println();
		System.out.println(punkt3.x);
		System.out.println(punkt4.x);

		System.out.println();
		
		punkt3.x = 20;
		punkt3.setX(5);
		
		System.out.println(punkt3.x);
		System.out.println(punkt4.x);

	}

}
