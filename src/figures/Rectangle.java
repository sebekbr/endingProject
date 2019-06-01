package figures;

public class Rectangle extends Figure implements Calcs {

	/* nP1
	 * p1-----------------p2
	 * |			      |
	 * |			      |
	 * |			      |			
	 * |			      |
	 * p4-----------------p3
	 * 					 nP2
	 */
	
	public Rectangle() {}
	
	public Rectangle(Point nP1, Point nP2) {
		setP1(nP1);
		setP2(new Point(nP2.getX(), nP1.getY())); // wyliczanie drugiego punktu na podstawie wspolrzednych punktow poczatkowych
		setP3(nP2);
		setP4(new Point(nP1.getX(), nP2.getY())); // wyliczanie drugiego punktu na podstawie wspolrzednych punktow poczatkowych
	}
	
	// Ilosc wierzcholkow figury
	public int pointsQuantity() {
		return 4;
	}
	
	// Obwod prostokata
	public double perimeter() {
		return 2*(Line.length(p1, p2) + Line.length(p2, p3));
	}

	// Pole prostokata
	public double area() {
		return Line.length(p1, p2)*Line.length(p2, p3);
	}
	
	// Wyswietlenie wynikow
	public void display() {
		System.out.printf("Obwod prostokata: %.2f \n", perimeter());
		System.out.printf("Pole prostokata: %.2f \n", area());
	}

}
