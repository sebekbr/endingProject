package figures;

public class Square extends Rectangle implements Calcs {
	/* nP1
	 * p1-----------p2
	 * |			|
	 * |			|
	 * |			|			
	 * |			|
	 * p4-----------p3
	 * 			   nP2
	 */
	
	
	public Square() {}
	
	public Square(Point nP1, Point nP2) {
		super(nP1, nP2); // wywoluje konstruktor rodzica (tu prostokata)
		double dl = Line.length(p1, p4);
		
		if (Line.length(p1, p2) != dl) {
			setP2(new Point(p1.getX() + ((int) dl), p1.getY()));
			setP3(new Point(p1.getX() + ((int) dl), p4.getY()));
		}
	}
	
	// Obwod kwadratu
	public double perimeter() {
		return 4*Line.length(p1, p2);
	}

	// Pole kwadratu
	public double area() {
		return Math.pow(Line.length(p1, p2), 2.0);
	}
	
	public void display() {
		System.out.printf("Obwod kwadratu: %.2f \n", perimeter());
		System.out.printf("Pole kwadratu: %.2f \n", area());
	}

}
