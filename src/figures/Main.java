package figures;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Tworzenie punktow domyslnych
		Point p1, p2, p3;
		System.out.println("Podaj wspolrzedne punktu 1 (x, Enter, y):");
		p1 = getPoint(input);

		System.out.println("Podaj wspolrzedne punktu 2 (x, Enter, y):");
		p2 = getPoint(input);

		System.out.println("Podaj wspolrzedne punktu 3 (x, Enter, y):");
		p3 = getPoint(input);

		// Tworzenie obiektow
		Line line = new Line(p1, p2);
		Rectangle rect = new Rectangle(p1, p2);
		Square sqr = new Square(p1, p2);
		Triangle trg = new Triangle(p1, p2, p3);
		Circle circ = new Circle(p1, p2);

		// ----PUNKT-----
		p1.display();
		System.out.println("------------------------------------------");

		// ----LINIA-----
		line.display();
		System.out.println("------------------------------------------");

		// ---PROSTOKAT---
		rect.display();
		System.out.println("------------------------------------------");

		// ----KWADRAT-----
		sqr.display();
		System.out.println("------------------------------------------");

		// ----TROJKAT-----
		trg.display();
		System.out.println("------------------------------------------");

		// ----KOLO-----
		circ.display();
		System.out.println("------------------------------------------");
	}

	public static Point getPoint(Scanner input) {
		Integer x = null; // Tworzenie obiektu typu Integer
		Integer y = null;

		// 
		while (x == null) { // dopóki pusty to oczekuje na wprowadzenie wartosci
			if (input.hasNextInt() == true) { //sprawdzam czy wprowadzono int
				x = input.nextInt();
			} else { // 
				System.out.println("Mozna wprowadzac tylko wartosci calkowite.");
				input.nextLine();
			}
		}

		while (y == null) {
			if (input.hasNextInt() == true) {
				y = input.nextInt();
			} else {
				System.out.println("Mozna wprowadzac tylko wartosci calkowite.");
				input.nextLine();
			}
		}

		return new Point(x, y);
	}
}