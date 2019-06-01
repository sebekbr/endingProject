package figures;

public class Circle extends Figure implements Calcs {

	public Circle() {}
	
	public Circle(Point p1, Point p2) {
		setP1(p1);
		setP2(p2);
	}
	
	// Obwod kola
	public double perimeter() {
		return 2*Math.PI*Line.length(p1, p2);
	}
	
	// Pole kola	
	public double area() {
		return Math.PI*(Math.pow(Line.length(p1, p2), 2.0));
	}
	
	// Wyswietlenie wynikow	
	public void display() {
		System.out.printf("Obwod kola: %.2f \n", perimeter());
		System.out.printf("Pole kola: %.2f \n", area());
	}
}
