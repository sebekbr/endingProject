package figures;

public class Line extends Figure implements Calcs{
	
	// Domyslny konstruktor
	public Line() {}
	
	public Line(Point p1, Point p2) {
		setP1(p1);
		setP2(p2);
	}

	// Ilosc wierzcholkow
	public int pointsQuantity() {
		return 2;
	}

	@Override
	public double perimeter() {
		return 0;
	}
	
	// Dlugosc ze wzoru Pitagorasa
	public static double length(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2.0) + Math.pow(p2.getY() - p1.getY(), 2.0));
	}
	
	@Override
	public double area() {
		return 0;
	}
	
	public void display() {
		System.out.printf("Dlugosc linii: %.2f \n", length(p1, p2));
	}

}
