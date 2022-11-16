package memento_Pattern;

public class Main {

	public static void main(String[] args) {
		Calcularice c = new Calcularice();
		System.out.println(c.somme(1, 2));
		System.out.println("l etat actuel est :");
		System.out.println(c.mementoB);
		System.out.println("l etat prelable est :");
		System.out.println(c.mementoA);
		System.out.println(c.produit(2, 3));
		System.out.println("l etat actuel est :");
		System.out.println(c.mementoB);
		System.out.println("l etat prelable est :");
		System.out.println(c.mementoA);

	}
}
